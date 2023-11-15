public class Recurrente{   
    public String inversoSimple(String cad){
        String res;
        res = invertirPalabra(inversoSimple(cad, cad.length(), ' '));
        return res;
    }

    private String inversoSimple(String cad, int n, char muestra){
        String res;
        if(n == 0){
            res = "";
        }else if(n-1 == 0){
            if(cad.charAt(0) != muestra){
                res = "" + cad.charAt(0);
            }else{
                res = "";
            }
        }else{
            if(cad.charAt(0) != muestra){
                String nCad = cad.substring(1, cad.length());
                res = "" + cad.charAt(0) + inversoSimple(nCad, nCad.length(), cad.charAt(0));
            }else{
                String nCad = cad.substring(1, cad.length());
                res = "" + inversoSimple(nCad, nCad.length(), cad.charAt(0));
            }
        }
        return res;
    }

    private String invertirPalabra(String cad){
        String res;
        res = invertirPalabra(cad, cad.length(), 0);
        return res;
    }

    private String invertirPalabra(String cad, int n, int i){
        String res;
        if(n == 0){
            res = "";
        }else if(i == n-1){
            res = "" + cad.charAt(n-1-i);
        }else{
            res = "" + cad.charAt(n-1-i) + invertirPalabra(cad, n, i+1);
        }
        return res;
    }
}