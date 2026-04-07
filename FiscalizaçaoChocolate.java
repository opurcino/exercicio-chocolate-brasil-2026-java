import java.util.Scanner;

public class FiscalizaçaoChocolate {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a porcentagem de sólidos de cacau encontrada na amostra:");
        double teor = scanner.nextDouble();

        if(teor < 25){
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate");
        }else if(teor >= 25 && teor < 35){
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        }else if(teor <= 35){
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
            
        }
        System.out.println("Insira se o chocolate é ao_leite ou amargo:");
        String tipoChocolate = scanner.next().toLowerCase();
        System.out.println("Qual a quantidade de açucar por porção?");
        int açucar = scanner.nextInt();
            if ("ao_leite".equals(tipoChocolate) && açucar > 15){
                System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
            } else{
                System.out.println("Classificação: Chocolate balanceado");
   
            }
        System.out.println("Quanto custou o ovo de Páscoa?");
        double preço = scanner.nextDouble();
        System.out.println("Qual a pureza do ovo (0 a 10)?");
        int pureza = scanner.nextInt();
        if (preço < 100 || pureza < 5) {
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        }else{
            System.out.println("APROVADO: Produto competitivo para o mercado externo");

        

            
            
        }
            scanner.close();


    }
}
