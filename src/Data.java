/**
 * Created by Pawel on 2015-06-02.
 */
public class Data {

    int  day;
    int iMonth;
    int year;
    String sMonth;
    void changeMonth(String smonth, int imonth) {
        switch (imonth) {
            case 1:
                smonth = "Styczeñ";
                break;
            case 2:
                smonth = "Luty";
                break;
        }
    }
    void setMonth(int d, int m, int y){

    }
    void printData(){}

}
