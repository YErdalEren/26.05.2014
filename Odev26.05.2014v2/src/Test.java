import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;


public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> profListe = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			
			Profosor prof =new Profosor();
			prof.setFirstname(String.valueOf(JOptionPane.showInputDialog("L�tfen Prof'un ad�n� giriniz....").toUpperCase()));
			prof.setSurname(JOptionPane.showInputDialog("L�tfen Prof'un soyad�n� giriniz....").toUpperCase());
			prof.setPosition(JOptionPane.showInputDialog("L�tfen Prof'un pozisyonunu giriniz....").toUpperCase());
			prof.setArticleNumber(Integer.parseInt(JOptionPane.showInputDialog("L�tfen Prof.'un  makale numaras�n� giriniz....")));
			profListe.add(prof);
			System.out.println("S�ralanm�� Liste......");
			Collections.sort(profListe, new ismeGoreSirala());
			//System.out.println(prof.getFirstname());
			}
		
		
		// Ahmet isimli prof'un olup olmad���, var ise silinmesi
		/*for (int i = 0; i < profListe.size(); i++) 
		{
			if (profListe.get(i).getFirstname().equals("AHMET"))
			{
			profListe.remove(i);
			System.out.println("Belirtilen �artlara sahip Prof bulundu ve silindi....");
			System.out.println(profListe.get(i).getFirstname());
			
			}
			
			
		}*/
	
		//Ahmet isimli prof'un olup olmad���, var ise isminin de�i�tirlmesi
		
		/*for (int i = 0; i < profListe.size(); i++)
		{
		
			if (profListe.get(i).getFirstname().equals("AHMET"))
			{
				System.out.println("Ahmet isimli Prof bulundu....");
				profListe.get(i).setFirstname(JOptionPane.showInputDialog("L�tfen yeni ismi giriniz....").toUpperCase());
				System.out.println("Yanl�� isim d�zeltildi..");
			}
			
		}*/
			//yeni listenin s�ralanmas�
			for (int i = 0; i < profListe.size(); i++)
			{
				
				System.out.println(profListe.get(i).getFirstname());
			}
		
		}
		
	}


