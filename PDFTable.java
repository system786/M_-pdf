import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
/**
* This class is used to create a pdf file using iText jar.
* @author Ayush Maurya
*/
public class PDFTable {
public static void main(String args[]){
try {
//Create Document instance.
Document document = new Document();
//Create OutputStream instance.
OutputStream outputStream =
new FileOutputStream(new File("D:\\TestTableFile.pdf"));
Font font = new Font(Font.FontFamily.TIMES_ROMAN, 40,
                      Font.ITALIC | Font.UNDERLINE | Font.BOLD);
//Create PDFWriter instance.
PdfWriter.getInstance(document, outputStream);
document.open();
Paragraph paragraph1 = new Paragraph("SI.NO. : 181102531525");
Paragraph paragraph2 = new Paragraph("DR BHIMRAO AMBDEKAR UNIVERSITY,AGRA");
Paragraph paragraph3 = new Paragraph("FORMERLY-AGRA UNIVERSITY");
Paragraph paragraph4 = new Paragraph("MARKSHEET");
Paragraph paragraph5 = new Paragraph("STATEMENT OF MARKS:BACHELOR OF TECHNOLOGY 3rd YEAR");
Paragraph paragraph6 = new Paragraph("EXAMINATION :2022-2023");
Paragraph paragraph7 = new Paragraph("ROLL.NO  :  210900531825");
Paragraph paragraph8 = new Paragraph("Enrollment NO : A-2105230");
Paragraph paragraph9 = new Paragraph("Name of Candidate : AYUSH MAURYA");
Paragraph paragraph10 = new Paragraph("Category : Regular");
Paragraph paragraph11 = new Paragraph("Father's Name : MAN SINGH MAURYA");
Paragraph paragraph12 = new Paragraph("College : I.E.T \n \n \n \n");

paragraph1.setSpacingAfter(0);
paragraph1.setSpacingBefore(0);
paragraph1.setAlignment(Paragraph.ALIGN_RIGHT);
paragraph1.setIndentationLeft(40);
paragraph1.setIndentationRight(40);

paragraph2.setSpacingAfter(0);
paragraph2.setSpacingBefore(0);
paragraph2.setAlignment(Element.ALIGN_CENTER);
paragraph2.setIndentationLeft(40);
paragraph2.setIndentationRight(40);

paragraph3.setSpacingAfter(0);
paragraph3.setSpacingBefore(0);
paragraph3.setAlignment(Element.ALIGN_CENTER);
paragraph3.setIndentationLeft(40);
paragraph3.setIndentationRight(40);

paragraph4.setSpacingAfter(0);
paragraph4.setSpacingBefore(0);
paragraph4.setAlignment(Element.ALIGN_CENTER);
paragraph4.setIndentationLeft(40);
paragraph4.setIndentationRight(40);

paragraph5.setSpacingAfter(0);
paragraph5.setSpacingBefore(0);
paragraph5.setAlignment(Element.ALIGN_CENTER);
paragraph5.setIndentationLeft(40);
paragraph5.setIndentationRight(40);

paragraph6.setSpacingAfter(0);
paragraph6.setSpacingBefore(0);
paragraph6.setAlignment(Element.ALIGN_CENTER);
paragraph6.setIndentationLeft(40);
paragraph6.setIndentationRight(40);

paragraph7.setSpacingAfter(0);
paragraph7.setSpacingBefore(0);
paragraph7.setAlignment(Element.ALIGN_LEFT);
paragraph7.setIndentationLeft(40);
paragraph7.setIndentationRight(40);

paragraph8.setSpacingAfter(0);
paragraph8.setSpacingBefore(0);
paragraph8.setAlignment(Element.ALIGN_RIGHT);
paragraph8.setIndentationLeft(40);
paragraph8.setIndentationRight(40);

paragraph9.setSpacingAfter(0);
paragraph9.setSpacingBefore(0);
paragraph9.setAlignment(Element.ALIGN_LEFT);
paragraph9.setIndentationLeft(40);
paragraph9.setIndentationRight(40);

paragraph10.setSpacingAfter(0);
paragraph10.setSpacingBefore(0);
paragraph10.setAlignment(Element.ALIGN_RIGHT);
paragraph10.setIndentationLeft(40);
paragraph10.setIndentationRight(40);

paragraph11.setSpacingAfter(0);
paragraph11.setSpacingBefore(0);
paragraph11.setAlignment(Element.ALIGN_LEFT);
paragraph11.setIndentationLeft(40);
paragraph11.setIndentationRight(40);

paragraph12.setSpacingAfter(0);
paragraph12.setSpacingBefore(0);
paragraph12.setAlignment(Element.ALIGN_LEFT);
paragraph12.setIndentationLeft(40);
paragraph12.setIndentationRight(40);
 // add paragraph  call.
document.add(paragraph1);
document.add(paragraph2);
document.add(paragraph3);
document.add(paragraph4);
document.add(paragraph5);
document.add(paragraph6);
document.add(paragraph7);
document.add(paragraph8);
document.add(paragraph9);
document.add(paragraph10);
document.add(paragraph11);
document.add(paragraph12);


PdfPTable pdfPTable = new PdfPTable(4);
//Create cells
PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Paper code"));
PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Subject name"));
PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Credits"));
PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("Grades"));
PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("BCS-501"));
PdfPCell pdfPCell6 = new PdfPCell(new Paragraph("Math"));
PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("4"));
PdfPCell pdfPCell8 = new PdfPCell(new Paragraph("A"));
PdfPCell pdfPCell9 = new PdfPCell(new Paragraph("BCS-505"));
PdfPCell pdfPCell10 = new PdfPCell(new Paragraph("Data Structure & Algorithm"));
PdfPCell pdfPCell11 = new PdfPCell(new Paragraph("5"));
PdfPCell pdfPCell12 = new PdfPCell(new Paragraph("A+"));
PdfPCell pdfPCell13 = new PdfPCell(new Paragraph("BCS-505"));
PdfPCell pdfPCell14 = new PdfPCell(new Paragraph("Softwarae Engineering"));
PdfPCell pdfPCell15 = new PdfPCell(new Paragraph("4"));
PdfPCell pdfPCell16 = new PdfPCell(new Paragraph("A+"));
PdfPCell pdfPCell17 = new PdfPCell(new Paragraph("BCS-508"));
PdfPCell pdfPCell18 = new PdfPCell(new Paragraph("Digital Electronics"));
PdfPCell pdfPCell19 = new PdfPCell(new Paragraph("4"));
PdfPCell pdfPCell20 = new PdfPCell(new Paragraph("A"));
PdfPCell pdfPCell21 = new PdfPCell(new Paragraph("BCS-504"));
PdfPCell pdfPCell22 = new PdfPCell(new Paragraph("Computer Network"));
PdfPCell pdfPCell23 = new PdfPCell(new Paragraph("4"));
PdfPCell pdfPCell24 = new PdfPCell(new Paragraph("A+"));
PdfPCell pdfPCell25 = new PdfPCell(new Paragraph("BCS-506"));
PdfPCell pdfPCell26 = new PdfPCell(new Paragraph("DAA"));
PdfPCell pdfPCell27 = new PdfPCell(new Paragraph("4"));
PdfPCell pdfPCell28 = new PdfPCell(new Paragraph("A+"));
PdfPCell pdfPCell29 = new PdfPCell(new Paragraph("BCS-502 \n \n"));
PdfPCell pdfPCell30 = new PdfPCell(new Paragraph("java \n \n"));
PdfPCell pdfPCell31 = new PdfPCell(new Paragraph("4 \n \n"));
PdfPCell pdfPCell32 = new PdfPCell(new Paragraph("A+ \n \n"));
PdfPCell pdfPCell33 = new PdfPCell(new Paragraph("BCS-605 \n \n"));
PdfPCell pdfPCell34 = new PdfPCell(new Paragraph("Data Structure & Algorithm Lab \n \n"));
PdfPCell pdfPCell35 = new PdfPCell(new Paragraph("5 \n \n"));
PdfPCell pdfPCell36 = new PdfPCell(new Paragraph("A+ \n \n"));
PdfPCell pdfPCell37 = new PdfPCell(new Paragraph("BCS-607 \n \n"));
PdfPCell pdfPCell38 = new PdfPCell(new Paragraph("Java Lab \n \n"));
PdfPCell pdfPCell39 = new PdfPCell(new Paragraph("4 \n \n"));
PdfPCell pdfPCell40 = new PdfPCell(new Paragraph("A+ \n \n"));
PdfPCell pdfPCell41 = new PdfPCell(new Paragraph("BCS-608 \n \n"));
PdfPCell pdfPCell42 = new PdfPCell(new Paragraph("Digital Electronics Lab \n \n"));
PdfPCell pdfPCell43 = new PdfPCell(new Paragraph("4 \n \n"));
PdfPCell pdfPCell44 = new PdfPCell(new Paragraph("A \n \n"));
PdfPCell pdfPCell45 = new PdfPCell(new Paragraph("BCS-604 \n \n"));
PdfPCell pdfPCell46 = new PdfPCell(new Paragraph("DAA Lab \n \n"));
PdfPCell pdfPCell47 = new PdfPCell(new Paragraph("4 \n \n"));
PdfPCell pdfPCell48 = new PdfPCell(new Paragraph("A+ \n \n"));
PdfPCell pdfPCell49 = new PdfPCell(new Paragraph("BCS-501 \n \n"));
PdfPCell pdfPCell50 = new PdfPCell(new Paragraph("Industry Management \n \n"));
PdfPCell pdfPCell51 = new PdfPCell(new Paragraph("4 \n \n"));
PdfPCell pdfPCell52 = new PdfPCell(new Paragraph("A+ \n \n"));
PdfPCell pdfPCell53 = new PdfPCell(new Paragraph("Total point : \n \n \n"));
PdfPCell pdfPCell54 = new PdfPCell(new Paragraph("191 \n \n \n"));
PdfPCell pdfPCell55 = new PdfPCell(new Paragraph("50  \n \n \n"));
PdfPCell pdfPCell56 = new PdfPCell(new Paragraph("SCGPA :  9.01 \n \n \n"));



//Add cells to table
pdfPTable.addCell(pdfPCell1);
pdfPTable.addCell(pdfPCell2);
pdfPTable.addCell(pdfPCell3);
pdfPTable.addCell(pdfPCell4);
pdfPTable.addCell(pdfPCell5);
pdfPTable.addCell(pdfPCell6);
pdfPTable.addCell(pdfPCell7);
pdfPTable.addCell(pdfPCell8);
pdfPTable.addCell(pdfPCell9);
pdfPTable.addCell(pdfPCell10);
pdfPTable.addCell(pdfPCell11);
pdfPTable.addCell(pdfPCell12);
pdfPTable.addCell(pdfPCell13);
pdfPTable.addCell(pdfPCell14);
pdfPTable.addCell(pdfPCell15);
pdfPTable.addCell(pdfPCell16);
pdfPTable.addCell(pdfPCell17);
pdfPTable.addCell(pdfPCell18);
pdfPTable.addCell(pdfPCell19);
pdfPTable.addCell(pdfPCell20);
pdfPTable.addCell(pdfPCell21);
pdfPTable.addCell(pdfPCell22);
pdfPTable.addCell(pdfPCell23);
pdfPTable.addCell(pdfPCell24);
pdfPTable.addCell(pdfPCell25);
pdfPTable.addCell(pdfPCell26);
pdfPTable.addCell(pdfPCell27);
pdfPTable.addCell(pdfPCell28);
pdfPTable.addCell(pdfPCell29);
pdfPTable.addCell(pdfPCell30);
pdfPTable.addCell(pdfPCell31);
pdfPTable.addCell(pdfPCell32);
pdfPTable.addCell(pdfPCell33);
pdfPTable.addCell(pdfPCell34);
pdfPTable.addCell(pdfPCell35);
pdfPTable.addCell(pdfPCell36);
pdfPTable.addCell(pdfPCell37);
pdfPTable.addCell(pdfPCell38);
pdfPTable.addCell(pdfPCell39);
pdfPTable.addCell(pdfPCell40);
pdfPTable.addCell(pdfPCell41);
pdfPTable.addCell(pdfPCell42);
pdfPTable.addCell(pdfPCell43);
pdfPTable.addCell(pdfPCell44);
pdfPTable.addCell(pdfPCell45);
pdfPTable.addCell(pdfPCell46);
pdfPTable.addCell(pdfPCell47);
pdfPTable.addCell(pdfPCell48);
pdfPTable.addCell(pdfPCell49);
pdfPTable.addCell(pdfPCell50);
pdfPTable.addCell(pdfPCell51);
pdfPTable.addCell(pdfPCell52);
pdfPTable.addCell(pdfPCell53);
pdfPTable.addCell(pdfPCell54);
pdfPTable.addCell(pdfPCell55);
pdfPTable.addCell(pdfPCell56);

//Add content to the document using Table objects.

document.add(pdfPTable);
Image image = Image.getInstance("C:\\Users\\AYUSH MAURYA\\Downloads\\Image 2023-11-05 at 18.38.24.jpeg");
image.scaleAbsolute(60f, 60.5f);
image.setAbsolutePosition(500f, 700f);
document.add(image);
//Close document and outputStream.
document.close();
outputStream.close();
System.out.println("Pdf created successfully.");
} catch (Exception e) {
e.printStackTrace();
  }
 }
}

