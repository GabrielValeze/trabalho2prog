public class Main {
    
public static void main(String[] args) {

Fila<Integer> fila = new Fila() {

@Override
public Object getElemento() {
return "12";
}

@Override
public Object getProximo() {
return "0";
}
};

System.out.println(fila.getElemento());
System.out.println(fila.getProximo());


}
}