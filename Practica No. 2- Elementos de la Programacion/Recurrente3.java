public class Recurrente3{
    public int contarIguales(int num1, int num2){
        int res;
        if(num1 < 10 && num2 < 10){
            if(num1 == num2){
                res = 1;
            }else{
                res = 0;
            }
        }else{
            if((num1%10) == (num2%10)){
                res = 1 + contarIguales(num1/10, num2/10);
            }else{
                res = contarIguales(num1/10, num2/10);
            }
        }
        return res;
    }

    public int contarIguales2(int num1, int num2){
        int res;
        res = contarIguales2(num1, num2, 0);
        return res;
    }

    private int contarIguales2(int num1, int num2, int cont){
        int res;
        if(num1 < 10 && num2 < 10){
            if(num1 == num2){
                res = cont+1;
            }else{
                res = cont;
            }
        }else{
            if((num1%10) == (num2%10)){
                res = contarIguales2(num1/10, num2/10, cont+1);
            }else{
                res = contarIguales2(num1/10, num2/10, cont);
            }
        }
        return res;
    }
}