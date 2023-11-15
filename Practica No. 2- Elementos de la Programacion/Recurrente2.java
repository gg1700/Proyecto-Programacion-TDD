public class Recurrente2{
    public int calcularPromedio(int num){
        int res;
        if(num < 100){
            res = (num%10) - ((num%100)/10);
        }else{
            res = (num%10) - ((num%100)/10) + calcularPromedio(num/100);
        }
        return res;
    }
}