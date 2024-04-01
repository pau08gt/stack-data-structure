import java.util.Stack;
public class Pila {
    private Stack<Publicacion> pila;

    public Pila() {
        pila=new Stack<Publicacion>();
    }
    public void push(Publicacion dato)
    {
        pila.push(dato);
    }
    public Publicacion pop() throws Exception
    {
        if (pila.isEmpty())
        {
            throw new Exception("Pila Vacía");
        }
        else
        {
            return pila.pop();
        }
    }
    public Publicacion top() throws Exception
    {
        if (pila.isEmpty())
        {
            throw new Exception("Pila Vacía");
        }
        else
        {
            return pila.peek();
        }
    }
    @Override
    public String toString() {
        String resultado="";
        for(int i=pila.size()-1; i>=0; i++)
        {
            resultado+=pila.get(i).toString()+"\n\t";
        }
        return "Pila\n"+resultado;
    }
}
