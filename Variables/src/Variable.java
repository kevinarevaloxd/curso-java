public class Variable {
    public static void main(String[] args) {
        /*String corresponde a un objeto y por ello tiene muchos metodos*/
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);

        /*Aqui usamos el metodo toUpperCase()*/
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        /*numero es un valor y por ende no tiene ningun tipo de propiedad o metodo*/
        int numero = 10;
        System.out.println("numero = " + numero);

        /*Integer es una clase y coo cualquier otra clase de java si tiene metodos*/
        /*Estas clases le dan una funcionalidad extra al primitivo int*/
        Integer numeroInteger = 10;
        /*Hacemos uso del metodo doubleValue() que nos da la salida de 10.0 */
        System.out.println("numeroInteger = " + numeroInteger.doubleValue());

        /*Las variables dentro de un if solo pueden utilizarse en el if, pero si podemos usar variables declaradas previas al if*/
        boolean valor = true;
        if(valor){
            int numero2 = 10;
            System.out.println("numero2 = " + numero2);
            System.out.println("numero fuera del IF = " + numero);
        }

        /*Creacion de variables dinamicas, el tipo se asigna de forma automatica segun su valor */
        var numero3 = 15;
        var numero4 = "15";
        System.out.println("numero3 = " + numero3);
        System.out.println("numero4 = " + numero4);

    }
}
