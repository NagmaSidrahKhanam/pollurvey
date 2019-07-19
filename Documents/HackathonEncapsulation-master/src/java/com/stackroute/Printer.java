package com.stackroute;

public class Printer {

    // private variables declared
    // these can only be accessed by
    // public methods of class

    private int tonnerlevel;
    private int pagesprinted;
    private int pagesavailable;
    private int pagestobeprinted;



    public int getPagestobeprinted() {

        int available = getPagesavailable();
        if(available < pagestobeprinted){
            if(getPagesprinted() < available){

                return pagesprinted;
            }else{
                return available ;
            }
        }else{
            if(getDuplexprinter() == true){

                return pagestobeprinted/2;
            }else{
                return pagestobeprinted ;
            }
        }

    }

    public void setPagestobeprinted(int pagestobeprinted) {
        this.pagestobeprinted = pagestobeprinted;
    }

    private Boolean duplexprinter;

    public int getPagesavailable() {
        return pagesavailable;
    }

    public void setPagesavailable(int pagesavailable) {
        this.pagesavailable = pagesavailable;
    }



    public int getTonnerlevel() {
        return tonnerlevel;
    }

    public void setTonnerlevel(int tonnerlevel) {

        this.tonnerlevel = tonnerlevel;

    }

    public int getPagesprinted() {

        if(getDuplexprinter() == true){
            return pagesprinted/2;
        }else{
            return pagesprinted;
        }



    }

    public void setPagesprinted(int pagesprinted) {
        this.pagesprinted = pagesprinted;
    }

    public Boolean getDuplexprinter() {
        return duplexprinter;
    }

    public void setDuplexprinter(Boolean duplexprinter) {
        this.duplexprinter = duplexprinter;
    }

    public void checkTonerLevel(){

        int result;

        if(getTonnerlevel() >100){
            System.out.println("The tonner is full.Please lower down the tonner value");

        }
            if(this.tonnerlevel>0){

                result = this.tonnerlevel*10;

            }else{

                result =  0;
            }
            setPagesprinted(result);



    }


}
