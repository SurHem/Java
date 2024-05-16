// array = ["String","23.5","c","@","22.2","30","47","Mohak","Royal","Dhulo","71","4.2","77","0.1","#","&","**","mobile"]

public class DataTypeCount {
    public static void main(String[] args) {
        String arr[] = {"String","23.5","c","@","22.2","30","47","Mohak","Royal","Dhulo","71","4.2","77","0.1","#","&","**","mobile"};
        int ch = 0;
        int str = 0;
        int spe = 0;
        int flo = 0;
        int inte = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].charAt(0)  >= 65 &&  arr[i].charAt(0)  <= 90) || (arr[i].charAt(0)  >= 97 &&  arr[i].charAt(0)  <= 122)) {
                if (arr[i].length() == 1) {
                    ch++;
                }else{
                    str++;
                }
            }else if (arr[i].charAt(0) >= 47 && arr[i].charAt(0) <= 57) {
                if (arr[i].contains(".")) {
                    flo++;
                }else{
                    inte++;
                }
            }else{
                spe++;
            }
        }


        System.out.println("Number of Strings in array: "+str);
        System.out.println("Number of Characters in array: "+ch);
        System.out.println("Number of Float in array: "+flo);
        System.out.println("Number of Integer in array: "+inte);
        System.out.println("Number of Special in array: "+spe);

    }
}
