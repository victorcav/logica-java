public class DiaSemana {

    public static void main(String[] args) {

        int diaSemana = 3;

        if(diaSemana == 1){
            System.out.println("Domingo");
        }else if(diaSemana == 2){
            System.out.println("Segunda-feira");
        }else if(diaSemana == 3){
            System.out.println("Terca-feira");
        }else{
            System.out.println("Dia nao encontrado");
        }

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia nao encontrado");
        }
    }
}
