public class Pietro {
    public Okna[] okno;
    public Pietro(int liczbaPieter,int liczbaOkienNaPietrze){
        okno=new Okna[liczbaOkienNaPietrze];
        for(int i=0;i<liczbaOkienNaPietrze;i++){
            okno[i]= new Okna("okno "+(i+1)+" na pietrze "+liczbaPieter);
        }
    }

    public Okna[] getOkno() {
        return okno;
    }
}
