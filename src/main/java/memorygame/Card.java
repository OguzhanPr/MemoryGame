package memorygame;


    public class Card {

        private char deger;
        private boolean tahmin = false;  //

        //constructor
        public Card(char deger) {
            this.deger = deger;
        }

        //getter setter
        public char getDeger() {
            return deger;
        }
        public void setDeger(char deger) {
            this.deger = deger;
        }
        public boolean isTahmin() {
            return tahmin;
        }
        public void setTahmin(boolean tahmin) {
            this.tahmin = tahmin;
        }





}
