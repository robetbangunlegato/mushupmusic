package com.robet.mushupmusic;

import java.util.ArrayList;

public class Data {
    public static String[][] data = new String[][]{
            {"SING-OFF TIKTOK SONGS Part II (You Broke Me First, De Yang Gatal Gatal Sa) vs Mirriam Eka","Video ini adalah konten ber-copyright. sebagian penghasilan dari youtube akan masuk ke artist original pemilik lagu. Jika kalian mau memberikan support lebih berupa donasi pada kami untuk membantu memajukan channel ini, bisa klik link dibawah ini ya! Terima kasih banyak\n" +
                    "https://saweria.co/rezadarmawangsa","X3wYCb2tACk"},
            {"MASHUP 7 LAGU GALAU INDONESIA yang HITS pada masanya","Sadar ga kalau 7 lagu galau ini punya pola putaran chord yang sama dan semuanya HITS pada masanya? Nostalgia yuuuk...Kamu punya kenangan dengan lagu2 ini?\n" +
                    "Subscribe dulu, ga bakal rugi :)) http://www.youtube.com/user/ekagputra","XDLYGW7CKiM"},
            {"Medley Lagu Opening Kartun 90an!","Hari minggu, bangun pagi, nonton kartun.. Pengen bat balik kejaman itu","TjDEzI2c4IU"},
            {"EPIC MASHUP! 25 TAHUN ROSSA DALAM 7 MENIT","Mashup ini adalah kado dari saya dan Yessiel untuk menyambut perayaan 25 tahun berkaryanya teh Oca. Terakhir bikin mashup lagu pop indo seperti ini 7 tahun yang lalu. Selalu menyenangkan kalo produksi mashup, karena bukan hanya nadanya harus terasa seamless, tapi makna antar liriknya pun wajib saling terkait dan menyatu. Butuh waktu lumayan lama untuk menyatukan lagu-lagu legendarisnya teh Oca yang super banyak ini. Selamat menikmati 20 Lagu Rossa dalam 7 Menit","jQGlyZKwFsA"}
    };

    public static ArrayList<DataModel> getData(){
        ArrayList<DataModel> dataModelArrayList = new ArrayList<>();
        for(String[] varData : data){
            DataModel dataModel = new DataModel();
            dataModel.setJudul(varData[0]);
            dataModel.setKetererangan(varData[1]);

            dataModelArrayList.add(dataModel);
        }

        return dataModelArrayList;
    }
}
