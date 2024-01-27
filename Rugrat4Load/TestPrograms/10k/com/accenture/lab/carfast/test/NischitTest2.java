package com.accenture.lab.carfast.test;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;


public class NischitTest2 implements NischitTestInterface1, NischitTestInterface2 {
private BufferedWriter bufferedWriter = null;
private BufferedReader bufferedReader = null;
private static int lineCount = 0;

private File getNextFile(String logfile, String defaultFile) {
	File file = null;
	try{
		bufferedReader = new BufferedReader(new FileReader(logfile));
		String line = null;
		int breakPoint = 0;
		while((line = bufferedReader.readLine()) != null && breakPoint <= lineCount ) {
			breakPoint++;
		}
		lineCount++;
		file = new File(line);
		if(file.exists()) {
			return file;
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return new File(defaultFile);
}
static NischitTest11[] f0= new NischitTest11[14];
static long f1;


public String NischitTestInterface1Method0(NischitTest13 var0, NischitTest4 var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Config.Msi\\__UIC__RUGRAT__f5J3p.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 31 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 32 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 33 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 34 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 35 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 36 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 37 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 38 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 39 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 40 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 41 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 42 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 43 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 44 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 45 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 46 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 47 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 48 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 49 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 50 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 51 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 52 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Config.Msi\\__UIC__RUGRAT__f5J3p.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"gfitukcvzfnvkplxxouihdbpenddjeaajtrjhkqtzevycgazpihffttowjyekjylipwapchqlbvqvstzyxkbyjupmmmhky";

}

public Object NischitTestInterface2Method0(long var0, NischitTest9 var1, long var2, long var3){
 (new Thread(new NischitTest4())).start();
(new Thread(new NischitTest5())).start();
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var3+(long)(3054))<=(var3*(long)(196)))){
var1 = new NischitTest9();
}
for(int i = 0; i < 41; i++){
 if( ((var2%(long)(2685))>=(var2/(long)(397)))){
if( ((((var0%(long)(1525))*(var3+var2))==(var0%(long)(833)))&&((var3/(long)(312))==(var2-var3)))){
if( (((((var3+var0)>(var0-var3))&&((var3/(long)(2670))!=(var2-(long)(1513))))&&((((var2+var3)-((var0-(long)(1170))/(long)(2809)))!=(var0-var3))&&((var2*(long)(239))<(var3/(long)(3293)))))&&(((var3*var2)+(var2/(long)(1800)))<=(var3*var0)))){
var3 = (long)((var3%(long)(2138))+(var3%(long)(1912)));
}
}
}
}
for(int i = 0; i < 17; i++){
 if( (((var3%(long)(1803))/(long)(2405))>((var3*(long)(2874))*(var3*(long)(666))))){
if( ((var3*(long)(354))<(var3%(long)(1573)))){
if( ((var2%(long)(227))<=(var2-var3))){
var0 = (long)((var2-(long)(2516))+(var0+var2));
}
}
}
}
(new Thread(new NischitTest6())).start();
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__6ZgQOn.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 31 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\__UIC__RUGRAT__6ZgQOn.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public Object NischitTest2method0(String var0, String var1){
 try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var1+var0)==(var0+"oqsfmaorqbhhxhbtitayiqykndrnzqigtcilpvey"))){
if( ((var0+"bqfhbberdixxhohkjvzx")==(var1+var0))){
var0 = (String)((var0+"oqacbgjcpjmdprlrqdlhdjwttaqseerenekuhxacpczhijlutjmniuafwbdpygfmeyflwfxce")+(var1+"ffvhkptillmoehsxgvpovyzxhhjzairfoqvucshyakoejuvuljdbnfiupehbrlsunghylsspryzpkekbtqcbvwj"));
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Config.Msi\\__UIC__RUGRAT__xdcXa.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Config.Msi\\__UIC__RUGRAT__xdcXa.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
if((((var1+"zrqcpccdnfptafuujpnyinwlfgcmxwlvflcefahablgcjftqzckn")!=((var0+var1)+((var1+var0)+(var0+var1))))&&((var0+"ghpsirfaqtqapvhcxwigxrjfrshtso")!=(var1+"gtoraltiivvucq")))){
var0 = (String)((var0+"dgelncqstxvhsvtzbhuequbt")+((var0+"bfcbttbtmbkzebzkyxzptcfpuapq")+(((var1+"liohpygueutyxoxeoevqiztgis")+(var1+var0))+((var0+"amijyeowsaxcrxw")+(var0+"vzmihvumpznmsjpvedunmkzzlubdwrfipqboharhwngsebgsjpoxcekyirbnkvihrgkdvknflygndyfubkavlcfugx")))));
}
else{
 NischitTest2method2(var1,(int)(3294));}
if(((var0+var1)!=(var1+"asidayioixsagswgaoykjwmvtcmihajybgmpylzupplvhpiswadiickjtuedkesy"))){
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 40");
}
else{
 NischitTest2method3(var1,(long)(453),var0,null);}
if( ((var1+"djnzodcmxnxivmbrkyuvhnaedgdnysvnixzdmsmwnargxttexqbkorvruybajtuppryragltgzofz")!=(var0+var1))){
if( ((var0+"gfmpvnoiqovdkkbdwihkublltlrakurythqb")==(var0+var1))){
if( (((var0+"acgtvcddwykqcijrcmybqmwohndpqtawxhrndrkmqvmcgjobavsvyjdynlbtjzbxgtrwhrowipvyeb")+(var1+"ttgdumpvhoermfapetvqwjovcaaamtuycxcrajrjiltvqwkvfxpnelmpxrekktskcwkxandyiarb"))!=(var1+var0))){
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 49");
}
}
}
if( ((var0+var1)!=((var0+"bpxgqksvuttmtdwrjlzxqnmcqhkkoitjahtyimlntlreytkctzuxjvavhguweyiewaiqazmixnhh")+(var1+"zygapwbklaxzubvixccqnuzxxoxggjoaikfeywuprjfxdqgkryydtpcytvkbzpqequfglvao")))){
var1 = (String)(((var0+"lujphtvkddnwxsoequfbyavzsjodkwaklmwvnairlywicupwibxzypvebqagobugorksh")+(var0+var1))+(var1+var0));
}
for(int i = 0; i < 28; i++){
 if( ((var0+"yrfmmdwsehtwqsewkksgfmkjnrxslpzuxaiqycaaedgkmtlpzgash")!=(var0+"fmgn"))){
if( ((var1+var0)!=((var1+var0)+(var1+"ycbssluppkovcawjquntxjtcmkpmndthrgjgujevrfxafph")))){
if( ((var1+"at")!=(var0+"ccaaxnvjletclhidjqedywnuudkdyxmluhiucwydepbzypusronhtpyzwaagastvzxnsqnxqeaiprbpdmrgorgxehgssx"))){
var0 = "obplceedcakpqcytibehxlbgfv";
}
}
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Perl\\html\\faq\\Windows\\__UIC__RUGRAT__F3UcL.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 31 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 32 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 33 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 34 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 35 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 36 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 37 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 38 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 39 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 40 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 41 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Perl\\html\\faq\\Windows\\__UIC__RUGRAT__F3UcL.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)null;

}

public long NischitTest2method1(long var0, String var1, int var2, long var3){
 if( ((var2*(int)(2925))!=(var2/(int)(1469)))){
if( ((var2+(int)(1034))<=(var2+(int)(1297)))){
if( ((var2+(int)(679))>=(var2%(int)(2384)))){
var2 = (int)((var2+(int)(1844))%(int)(1868));
}
}
}
if(((var3/(long)(3135))<=(var0-(long)(2780)))){
var3 = (long)(var3*var0);
}
else{
 System.out.println("NischitTest2 - NischitTest2method1- LineInMethod: 12");
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var1+"irmcfgtccfhbaguwcfsnek")==(var1+"kdclvuninbomcockprnfcylvdcsbnvhnmlsnykdjpmmddoawqfyknuxowxgsmiwhlwpiaifkmpmztwhgbylpyyj"))){
if( ((((var2-(int)(1619))*(var2*(int)(2685)))<(var2-(int)(1108)))&&(((var2/(int)(1532))<(var2+(int)(2795)))&&((var2/(int)(1915))==(var2*(int)(108)))))){
var3 = (long)(((var3%(long)(946))+(var0%(long)(231)))%(long)(965));
}
}
if( ((var2-(int)(3452))>(var2*(int)(583)))){
if( ((((var1+"yuisvbtbivekyokgcfjcodptrjldemfqelzvhglgewojevzotuiujaddfqddarrmismdmupfotxiubieicqfmemqcqjbtges")+(var1+"fhsmxtcndzhhcygnhevaogofpyhqvwsogtpwanaqrclvsm"))!=((var1+"cojflomzqzascfuwilhhxbszhvihnanmxgbajgqtviwfmkxslczudoimeswkcscurgt")+((var1+"iewtotwmkvzihrauzcotufnagqsoizbyzlcmcgobilroprerrjhtfkxuwymchsfxeujoklardjxdhluphloefrpyiugsgzqkudk")+(var1+"dzboxmoevyercwnrblivfgkpskvhanrblv"))))&&((var1+"pocjodkfhxgvxfmtvenmlvpjonka")!=((var1+"qqumfnekqpszwalyokacqejqhdctnadpfyjccegnxcaxbpyaxafpsruysvrzkwwimyfukccisutvyv")+(var1+"tunbmiylfoasridumeofapkwwwvb"))))){
if( ((var3/(long)(1037))<(var0+(long)(613)))){
System.out.println("NischitTest2 - NischitTest2method1- LineInMethod: 28");
}
}
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Perl\\lib\\Win32\\__UIC__RUGRAT__fW8Vm.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Perl\\lib\\Win32\\__UIC__RUGRAT__fW8Vm.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public int NischitTest2method2(String var0, int var1){
 for(int i = 0; i < 10; i++){
 System.out.println("NischitTest2 - NischitTest2method2- LineInMethod: 2");
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var0+"zykseegk")!=(var0+"qintuqqipjnxmnorvmwqtbombhpttyndekxjxordjetsuivgvwzcemiapuswslevblcqrkbjpwsqwiqtzh"))){
if( (((var0+"psxppetwezsbgzbuuapcwxitzibyjrhslvrwobmhhxttiixebsohijatdoweraifodoh")==(var0+"wllumdpwsqjzcueitbzpcssfpcbevbtbj"))&&((var0+"loylwzqbjigzdvpfhlrtstjnphkokbnkhukknenqxgjipiraobpwjhjtcytixydhu")==(var0+"juzrwfgmfwqmzpfbcttgqlbeqjakknkwuuosceiwozricvyo")))){
var1 = (int)((var1+(int)(879))*(var1-(int)(102)));
}
}
switch((var1*(int)(1891))){
case 0:
var0 = (String)((var0+"azaceropppydxzcvwnnxwv")+(var0+"atubvsevbuhufzeubbrsfzxmhzw"));
 break;
case 1:
var1 = (int)((var1*(int)(203))-(var1*(int)(1792)));
 break;
case 2:
NischitTest2method4(var1,var0,null); break;
case 3:
var0 = (String)(((var0+"wecnvphgmbrzdhhyzqbbmmjtcydcfocgltscaplsjbtyboqmbwbcowgbnlzexeenickmlyrtznxvjzycerjtqefjxhezfswrfk")+((var0+"airslxlayknxjvbqwuuijhmpvvlmfhyebqvlotmscfzxreifbrqvchwutgtqstxseuodwmtfqvxiwgiix")+(var0+"hssgqsmcvqdovkbmctrbbqishbxduckzpeyxcwaxfmnlyavlafhqhiofvksim")))+(var0+"nloyhukcmcgxvrnhnxapxtwgzkscdurcdfaokanfrikvomwtpxphluutbmstmxfoylcusmwtflsrcobbiscnevbaoh"));
 break;
case 4:
System.out.println("NischitTest2 - NischitTest2method2- LineInMethod: 26");
 break;
case 5:
var1 = (int)((var1/(int)(1797))%(int)(3057));
 break;
default :
System.out.println("NischitTest2 - NischitTest2method2- LineInMethod: 35");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\qing_xie\\.dbvis\\config\\keymaps\\__UIC__RUGRAT__hE2bj.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 31 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 32 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 33 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 34 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 35 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 36 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 37 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 38 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 39 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 40 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 41 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 42 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 43 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 44 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 45 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 46 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 47 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 48 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 49 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 50 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 51 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Documents and Settings\\qing_xie\\.dbvis\\config\\keymaps\\__UIC__RUGRAT__hE2bj.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var1;

}

public int NischitTest2method3(String var0, long var1, String var2, NischitTest12 var3){
 for(int i = 0; i < 15; i++){
 var2 = "yyooz";
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__fshbC.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\__UIC__RUGRAT__fshbC.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
for(int i = 0; i < 2; i++){
 if( ((var1*(long)(2486))<(var1%(long)(2990)))){
var2 = (String)((var2+"iquminnljnfgyosuxksynozdrqpneetpdugyzhwmszolaoysjzhhh")+(var0+"hanebhhoygpocurgvuonjihmxa"));
}
}
if(((var1-(long)(2142))<((var1/(long)(1561))-((var1/(long)(35))-(var1-(long)(2221)))))){
System.out.println("NischitTest2 - NischitTest2method3- LineInMethod: 60");
}
else{
 var0 = (String)(((var0+"deulnzpdivhusshtnxhrxldteksmbimoxkkkepjhcpvrwbjgohpzrxolg")+(var2+var0))+(var0+var2));
}
if( (((var1/(long)(1640))+(var1-(long)(339)))<(var1-(long)(383)))){
if( (((var1/(long)(2609))<=(var1+(long)(517)))&&(((var1*(long)(3447))+(var1-(long)(3441)))<=(var1+(long)(1442))))){
if( (((var1-(long)(3192))*(var1*(long)(3229)))>=(var1+(long)(1471)))){
var1 = (long)((var1*(long)(331))*((var1+(long)(2848))*(var1+(long)(518))));
}
}
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\xampp\\mysql\\bin\\__UIC__RUGRAT__mz6vC.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\xampp\\mysql\\bin\\__UIC__RUGRAT__mz6vC.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)(int)(2733);

}

public static Object NischitTest2method4(int var0, String var1, NischitTest10 var2){
 if(((var0-(int)(2186))<(var0%(int)(1572)))){
System.out.println("NischitTest2 - NischitTest2method4- LineInMethod: 4");
}
else{
 f0[0] = new NischitTest11();
}
return (Object)var2;

}


public static void main(String args[]){
NischitTest2 obj = new NischitTest2();
obj.NischitTestInterface1Method0(new NischitTest13(),new NischitTest4());
obj.NischitTestInterface2Method0((long)(3186),new NischitTest9(),(long)(2691),(long)(999));
obj.NischitTest2method0("xoyrezfbcqgpiquqwdyrafsxtedpiyfblq","nanxxhbvgeslmuffjgfcniawbpxipiuorotxvuuajyrxtr");
obj.NischitTest2method1((long)(3389),"weojepsjwgpdruhomcvh",(int)(403),(long)(2856));
obj.NischitTest2method2("ciqaurhxuhfvvx",(int)(3170));
obj.NischitTest2method3("wgcxzgzkzjjtqvrgtaxrvwrjrksweyeikfbubifydlsgxumiziphkrqragaqjymgjxtogtsrfcdun",(long)(3244),"fzxseedvhwtrndlfzijkplshczcfjqyabimoovxxhacw",new NischitTest12());
NischitTest2method4((int)(2165),"ektyrekz",new NischitTest10());
}

}