package arrays;

public class ArjunString {
    
    public static void main(String[] args) {
        String dna = new String("AGCTA");
        System.out.println(transcribe(dna));
    }

    static String transcribe(String dnaStrand) {
        int l = dnaStrand.length();
        char[] temp = dnaStrand.toCharArray();
        for(int i = 0; i < l; i++)
        {
            if(dnaStrand.charAt(i)=='G'){
                temp[i] = 'C';
            }
            else if(dnaStrand.charAt(i)== 'C'){
                temp[i] = 'G';
            }
            else if(dnaStrand.charAt(i)=='T'){
                temp[i] = 'A';
            }
            else if(dnaStrand.charAt(i)=='A'){
                temp[i] = 'U';
            }
        }
        return String.valueOf(temp);

    }

}
