public class Text {

    String text = "India is my country.I love my India";
    String author = "K.L Narayan";
    int length;
    String resultstring;


    String getText() {
        return text;
    }
    void setText(String text) {
        this.text = text;

    }
    String getAuthor() {
      return author;

    }
    void setAuthor(String author) {
        this.author = author;
    }
    int getLength() {
        return length;
    }
    void setLength(int length) {
        this.length = length;
    }


    /*methods that change the text*/
    void allLettersToUpperCase() {

        String uppercase = getText().toUpperCase();
        setText(uppercase);
        setLength(uppercase.length());


    }


    void findSubTextAndDelete(String s) {

        String subdel = s.substring(8,11);
        resultstring = getText().replace(subdel,"");

    }


    /*method for formatting output*/
    void printText() {


        System.out.println("Author is: "+ author);
        System.out.println(resultstring.substring(13,getLength()-1));

//        while (resultstring.length()!=0){
//            if(resultstring.contains(".")){
//                System.out.println("\n");
//            }
//            System.out.println(resultstring);
//        }



    }


}
