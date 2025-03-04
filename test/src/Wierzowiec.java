public class Wierzowiec {
    public Pietro[] pietra;
    public Wierzowiec(int liczbaPieter,int liczbaOkienNaPietrze){
        pietra=new Pietro[liczbaPieter];
        for(int i=0;i<liczbaPieter;i++){
            pietra[i]= new Pietro(i+1,liczbaOkienNaPietrze);
        }
    }

    public Pietro[] getPietra() {
        return pietra;
    }
}
