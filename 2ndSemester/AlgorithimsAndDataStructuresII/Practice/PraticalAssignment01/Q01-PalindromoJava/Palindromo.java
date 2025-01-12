import java.util.Scanner;

class Palindromo{
  public static Scanner sc = new Scanner(System.in);
  //metodo que compara os caracteres de forma simetrica 
  public static boolean checkPalindromo(String entrada){
    boolean resultado = true;
    int tamanho = entrada.length();
    int i = 0;
    
    do {
      if(entrada.charAt(i) != entrada.charAt(tamanho - 1 - i))
        resultado = false;
      i++;
    }
    while(i < tamanho/2 && resultado != false);
  
    return resultado;
  }

  //metodo que faz verificacao do fim do programa
  public static boolean checkFim(String entrada){ 
    return (entrada.length() == 3 && entrada.charAt(0) == 'F' && entrada.charAt(1) == 'I' && entrada.charAt(2) == 'M');
  }
  
  //metodo principal do programa
  public static void main(String[] args){
    String entrada;
    do{
      entrada = sc.nextLine();

      if(checkPalindromo(entrada))
        System.out.println("SIM");
      else 
        System.out.println("NAO");
    
    }while(!checkFim(entrada));
  }
}
