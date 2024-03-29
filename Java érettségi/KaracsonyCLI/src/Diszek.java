public class Diszek {

        private int nap;

        public int getNap() {
            return nap;
        }

        private int harangKesz;

        public int getHarangKesz() {
            return harangKesz;
        }

        private int harangEladott;

        public int getHarangEladott() {
            return harangEladott;
        }

        private int angyalkaKesz;

        public int getAngyalkaKesz() {
            return angyalkaKesz;
        }

        private int angyalkaEladott;

        public int getAngyalkaEladott() {
            return angyalkaEladott;
        }

        private int fenyofaKesz;

        public int getFenyofaKesz() {
            return fenyofaKesz;
        }

        private int fenyofaEladott;

        public int getFenyofaEladott() {
            return fenyofaEladott;
        }

        public Diszek(String sor) {
            String[] s = sor.split(";");

            nap = Integer.parseInt(s[0]);

            harangKesz = Integer.parseInt(s[1]);
            harangEladott = Integer.parseInt(s[2]);
            angyalkaKesz = Integer.parseInt(s[3]);
            angyalkaEladott = Integer.parseInt(s[4]);
            fenyofaKesz = Integer.parseInt(s[5]);
            fenyofaEladott = Integer.parseInt(s[6]);
        }

        public int napiBevetel() {
            return -(harangEladott * 1000 + angyalkaEladott * 1350 + fenyofaEladott * 1500);
        }
    }

