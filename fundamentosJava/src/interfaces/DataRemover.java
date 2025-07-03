package interfaces;
//INTERFACE serve para contrato de implementação, ou seja ser como um formulario a ser implementado nas 'filhas'

public interface DataRemover {

    //Por padrão o metodo ja vem implicitamente escrito 'public abstract'
    // então nao precisa escrever no metodo, é redundante. E por ser abstract nao precisa de body
    public  abstract void remove();
}
