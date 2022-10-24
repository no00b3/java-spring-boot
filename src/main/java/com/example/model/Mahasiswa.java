// Mahasiswa.java

package com.example.model;
public class Mahasiswa {
//! Properties sesuai dengan tabel mahasiswa
private String nim;
private String nama;
private String angkatan;
private String id_tempat;
//! Setter dan Getter Properties
public String getNama() {
return nama;
}
public void setNama(String nama) {
this.nama = nama;
}
public String getNim() {
return nim;
}
public void setNim(String nim) {
this.nim = nim;
}
public String getAngkatan() {
return angkatan;
}
public void setAngkatan(String angkatan) {
this.angkatan = angkatan;
}
public String getId_tempat() {
return id_tempat;
}
public void setId_tempat(String id_tempat) {
this.id_tempat = id_tempat;
}
}