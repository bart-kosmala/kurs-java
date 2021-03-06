package zajecia13;

import java.util.ArrayList;
import java.util.Date;

import zajecia12.Produkt;

public class Invoice {
	private String numer;
    private Date data;
    private ArrayList<Produkt> produkty;

    public Invoice(String numer, ArrayList<Produkt> produkty) {
        this.numer = numer;
        this.produkty = produkty;
        this.data = new Date();
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
}
