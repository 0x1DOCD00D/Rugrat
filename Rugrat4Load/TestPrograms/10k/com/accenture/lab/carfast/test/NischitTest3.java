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


public class NischitTest3 implements NischitTestInterface2 {
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
long[] f0= new long[19];
String[] f1= new String[26];
static int f2;
static String f3;
NischitTest3 f4;
int[] f5= new int[12];
String[] f6= new String[26];


public Object NischitTestInterface2Method0(long var0, NischitTest9 var1, long var2, long var3){
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var2/(long)(1815))<=(var0%(long)(2428)))){
System.out.println("NischitTest3 - NischitTestInterface2Method0- LineInMethod: 2");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\ime\\imejp98\\__UIC__RUGRAT__6L2YS.txt"));
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
bufferedWriter.write("Writing line 53 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 54 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 55 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 56 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 57 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 58 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 59 to file");
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
bufferedWriter.append("C:\\WINDOWS\\ime\\imejp98\\__UIC__RUGRAT__6L2YS.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public int NischitTest3method0(NischitTest0 var0, long var1){
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Intel\\Logs\\__UIC__RUGRAT__M12VL.txt"));
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
bufferedWriter.append("C:\\Intel\\Logs\\__UIC__RUGRAT__M12VL.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
if( (((var1/(long)(1470))*(var1+(long)(2316)))>(f0[9]+f0[9]))){
if( ((var1/(long)(1817))==(var1/(long)(468)))){
var1 = NischitTest3method2(var1,var1);
}
}
if((((var1-(long)(1841))*(var1-(long)(163)))>=(var1*(long)(2029)))){
System.out.println("NischitTest3 - NischitTest3method0- LineInMethod: 68");
}
else{
 f6[21] = (String)((f1[15]+f6[25])+("npwjpmrnkeymrnteliorjfpl"+"zzxilsxxthlempjljljpmadfhjfqbxeluctmpdhzglbjcivgaoqifpxmfxsgigcrdrfjkytjuvhmrlhlrkpjaugtmmsgzz"));
}
(new Thread(new NischitTest4())).start();
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
if(((((var1-(long)(2868))>=(var1/(long)(1715)))||((((var1%(long)(1710))<=(f0[0]*f0[9]))||((var1+(long)(1738))>=((((var1-(long)(3028))-((var1/(long)(2663))-(var1-(long)(665))))-((var1+(long)(678))*((var1-(long)(1058))-(var1-(long)(1826)))))*(var1+(long)(910)))))||((var1/(long)(2505))>=(f0[0]/(long)(2173)))))&&(((f0[15]-f0[13])+(f0[1]%(long)(1917)))<=(f0[12]+f0[3])))){
System.out.println("NischitTest3 - NischitTest3method0- LineInMethod: 74");
}
else{
 System.out.println("NischitTest3 - NischitTest3method0- LineInMethod: 79");
}
(new Thread(new NischitTest5())).start();
for(int i = 0; i < 47; i++){
 var0 = new NischitTest0();
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
for(int i = 0; i < 6; i++){
 if( ((var1/(long)(2879))>((var1+(long)(3361))+(var1/(long)(2768))))){
if( ((var1+(long)(3249))<(f0[5]*f0[18]))){
if( ((var1-(long)(3280))<(var1*(long)(3157)))){
if( ((((var1/(long)(1079))>(var1-(long)(1702)))||((var1*(long)(3260))!=((var1%(long)(2273))+(var1-(long)(1060)))))&&(((f0[12]*f0[4])*(f0[16]-f0[15]))>(var1%(long)(133))))){
if( ((var1+(long)(2488))<=((((var1-(long)(2229))-((var1+(long)(238))-(var1*(long)(1242))))-(var1%(long)(2437)))+(var1*(long)(2669))))){
System.out.println("NischitTest3 - NischitTest3method0- LineInMethod: 99");
}
}
}
}
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
if( ((var1+(long)(812))!=(var1*(long)(2154)))){
System.out.println("NischitTest3 - NischitTest3method0- LineInMethod: 103");
}
if( (((var1*(long)(3189))==(f0[8]*f0[15]))||((var1%(long)(3069))==(var1*(long)(1362))))){
f1[19] = (String)(("gctyfjssfq"+"gicpijlmvtgrmoqptgvzaptbfos")+((f6[1]+f6[18])+((f1[25]+f1[5])+(f1[8]+f1[11]))));
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
if((((var1%(long)(2047))==(var1/(long)(2846)))&&((var1*(long)(273))!=(var1%(long)(717))))){
var1 = NischitTest3method2(var1,var1);
}
else{
 f0[8] = (long)((f0[10]+f0[11])*(var1*(long)(367)));
}
return (int)(int)(367);

}

public long NischitTest3method1(String var0, NischitTest2 var1){
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
for(int i = 0; i < 17; i++){
 System.out.println("NischitTest3 - NischitTest3method1- LineInMethod: 2");
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Config.Msi\\__UIC__RUGRAT__1dPJK.txt"));
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
bufferedWriter.append("C:\\Config.Msi\\__UIC__RUGRAT__1dPJK.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
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
if( ((f6[1]+f6[25])==(f1[10]+f6[21]))){
if( ((var0+"eoxfvxlzfribtmctmxocnfsodymarwdszebwhyzlpvcjejvsneytvqwygzkkjepuljbawd")!=((var0+"itifjktrqeenwasmywwiytzahasonycdjapgfjiavkuxkoftstsqmehnif")+(var0+"elvcfjuqacjhntqzaxznvmjkiujgllzadrvsqassrzibwxldeoezwtalydzp")))){
System.out.println("NischitTest3 - NischitTest3method1- LineInMethod: 90");
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\strawberry\\cpan\\__UIC__RUGRAT__DQm7Ktp.txt"));
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
bufferedWriter.append("C:\\strawberry\\cpan\\__UIC__RUGRAT__DQm7Ktp.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(1573);

}

public long NischitTest3method2(long var0, long var1){
 for(int i = 0; i < 4; i++){
 var0 = (long)(1776);
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
(new Thread(new NischitTest6())).start();
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
for(int i = 0; i < 22; i++){
 if( ((var1/(long)(2098))<=(var0-(long)(3085)))){
var0 = (long)(616);
}
}
for(int i = 0; i < 44; i++){
 System.out.println("NischitTest3 - NischitTest3method2- LineInMethod: 8");
}
if( (((var0%(long)(1293))-(var1*var0))==(var0*var1))){
var1 = (long)(((var0+(long)(2439))+(var1-(long)(144)))*(f0[0]*f0[16]));
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\srchasst\\mui\\0409\\__UIC__RUGRAT__3ITnJ.txt"));
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
bufferedWriter.append("C:\\WINDOWS\\srchasst\\mui\\0409\\__UIC__RUGRAT__3ITnJ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
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
if( (((f0[6]/(long)(10))*((f0[2]*f0[13])*((f0[15]+f0[0])+(f0[14]-f0[7]))))>=(f0[14]*f0[7]))){
if( (((var1*(long)(3113))>(var0%(long)(1485)))&&((var1/(long)(219))>(var1-var0)))){
if( ((var1/(long)(542))!=(f0[13]-f0[6]))){
if( (((f0[6]+f0[10])-(f0[16]+f0[16]))==(var0-(long)(1801)))){
if( ((var0/(long)(3078))>(var1+(long)(2889)))){
if( (((var0*var1)<(var1+var0))&&(((f0[17]-f0[15])>((((var1/(long)(3123))%(long)(3372))*(var0*var1))/(long)(491)))||((f0[5]-f0[17])<((var1/(long)(2394))-(var0*var1)))))){
f4 = new NischitTest3();
}
}
}
}
}
}
if(((var1*(long)(597))!=(var1%(long)(2924)))){
var0 = (long)(1393);
}
else{
 NischitTest3method3((int)(2079),var1);}
if(((var1*var0)>(var0*(long)(397)))){
var0 = (long)(856);
}
else{
 NischitTest3method4("dhssokufdxfooyfjttjwealcnwroueuidfdiygkgelqznhckjxqojrghp",(int)(2469));}
for(int i = 0; i < 13; i++){
 var1 = (long)(2157);
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
if( (((f0[9]*f0[14])==((var0-(long)(1415))-(var0+(long)(1571))))&&((var1/(long)(1498))!=(var1+(long)(3262))))){
System.out.println("NischitTest3 - NischitTest3method2- LineInMethod: 107");
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
if( (((var0*(long)(3431))*(var1-var0))!=(var1+(long)(2185)))){
var0 = (long)((var0+(long)(1532))+(var0*var1));
}
return (long)var1;

}

public static String NischitTest3method3(int var0, long var1){
 for(int i = 0; i < 43; i++){
 if( ((var1*(long)(2273))>((var1*(long)(1834))+(var1/(long)(731))))){
if( ((var0/(int)(3222))<=((f2-(int)(2898))+(f2*(int)(1860))))){
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 6");
}
}
}
if(((var0/(int)(972))==(var0*(int)(1596)))){
var0 = NischitTest3method4("skitsdlvznbegnikkngrnntxnuzazdzdfdwrnxbuceismcjfynyjls",var0);
}
else{
 var1 = (long)((var1*(long)(437))+(var1*(long)(262)));
}
if( ((var1*(long)(81))==(var1-(long)(465)))){
var1 = (long)(((var1%(long)(3170))-(var1*(long)(3261)))%(long)(442));
}
for(int i = 0; i < 6; i++){
 if( (((f2/(int)(2515))+(f2-(int)(2895)))!=(var0*(int)(2262)))){
if( ((var0+(int)(3046))>(var0+(int)(1084)))){
var0 = NischitTest3method4("ovapuk",var0);
}
}
}
switch((var0%(int)(1654))){
case 0:
f2 = (int)((var0+(int)(1962))*(var0/(int)(802)));
 break;
case 1:
var0 = (int)((var0+(int)(1121))%(int)(1791));
 break;
case 2:
NischitTest3method4("kmwgezsrgouzyqbaaeugyn",var0); break;
case 3:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 34");
 break;
default :
NischitTest3method4("ojnumjyoktkzhtwascmalrxhvowxrwkdxtsktxtdlcykihiamsfhtmvhp",var0);}
if(((var0+(int)(577))>(var0%(int)(21)))){
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 44");
}
else{
 System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 48");
}
if( (((((((var0-(int)(2262))!=(f2/(int)(1055)))&&((var0+(int)(3229))<((var0*(int)(3405))/(int)(125))))&&((var0*(int)(2649))!=(var0+(int)(261))))&&(((var0-(int)(76))+(var0/(int)(462)))<(f2-(int)(1060))))&&((var0/(int)(615))>(var0%(int)(1738))))&&((var0+(int)(2071))>=(var0-(int)(3330))))){
var1 = (long)((var1-(long)(2649))+(var1/(long)(3066)));
}
if( (((var0*(int)(402))<(f2*(int)(1803)))&&((f2-(int)(1629))>=((var0-(int)(304))+(var0-(int)(1641)))))){
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 56");
}
switch(((var0/(int)(3012))/(int)(560))){
case 0:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 60");
 break;
case 1:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 64");
 break;
default :
var1 = (long)((var1*(long)(2801))-(var1*(long)(1725)));
}
switch(((var0-f2)+(var0/(int)(2217)))){
case 0:
var1 = (long)(321);
 break;
case 1:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 76");
 break;
case 2:
var0 = (int)(f2+(int)(2586));
 break;
case 3:
var1 = (long)(3390);
 break;
case 4:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 88");
 break;
case 5:
NischitTest3method4("qurfsyzrubnkvewjdqyxffaepagaleolcyjvjdtsl",var0); break;
case 6:
System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 94");
 break;
default :
f3 = (String)((("dsnskndkbyqelwkljgtgikijpgnmlcpgujgzxiwnushslixvvbajxzrbktvlcxrszfyforymbpcnhmaajjupzbnmhlwiow"+"wvayzinqocdmeuwurrioywebcppgpktyqnxgkfuetaienzcwqqmaxipsqobjlzuudjvvmgmfewjfspwgrkaxkonufogfslrhhw")+(("sndqrhrxbxjbjmaahndtehllfdflbcclewdhihwwqkwuohsdwuimjvyquvogvbdetsxuaenlaneicyusicnxmafylflgaicwlycbk"+"ybrtphuypfuzfiuoljevksjyuayyznmodyuekmnazmdsewbxlucpsjcklffesxfacbiizkrlgcmshcxjuuwqwuqmgypsba")+("bgczyhgzrmxkamcnacobfk"+"uzzelvfullmerbqvbrrrvuztmtfbcjvfcapkxbqttknkvt")))+(f3+"jlxuzvqrvpnaguuhinxubjroscjtdplvpdttqpkdhgcgrsafkkifdojljvrpfjjffmijvqfmmotvnokriehnmhdinvgoipcluifg"));
}
if( (((var1-(long)(2615))*(var1-(long)(1288)))>(var1-(long)(3377)))){
f3 = (String)(("oqtmvcdkxsqgiftrxajguhtecqpaixjjyqjivxegpdyljfo"+"idcqalekpozibdmcnobejtxzolrp")+("ntygxrnytnyabtxxdnuxuvapm"+"afstmllrtjuiog"));
}
return (String)"oakzfjbxaxuytylivyosjuufvktuprtrcgujauwnchubvbfuxmmxufffpovxnqiwcrfisojmfdsgvopggulyptjhqyop";

}

public static int NischitTest3method4(String var0, int var1){
 switch(((var1%(int)(1469))/(int)(2678))){
case 0:
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 2");
 break;
case 1:
var0 = "dlfyasovqfsrblenfhoubvaglxmvfcgwvhgkduzfxqaucxetmtpdur";
 break;
case 2:
var1 = (int)((var1+(int)(2862))%(int)(2599));
 break;
default :
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 11");
}
if(((var0+"fsmghwojqfppdpjmxgoyxzjqnixykcwmcynfftpevtgizjsqmqkgpahftgjcttmsfxgmpmyxjkcbntfktgmezgcldphvevsid")==(var0+"gtruzdhwhfiluhuigebqqgxdvvcrpvdl"))){
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 16");
}
else{
 var1 = (int)(1300);
}
if(((var0+"ptnk")==(var0+"hxwbaadwksstvnamfgwrjjiwngxhrxkmngclxwzxfumkxcawkmmjwzbdjqqgfzqhcuqpnvsrjdpxqgnjklpq"))){
var0 = "hahjslnuippftcqcxuhwtfcxcrvhdxhyadfdtsgazgxeyyo";
}
else{
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 25");
}
switch((var1*f2)){
case 0:
var1 = (int)(((var1+(int)(3026))*((var1-(int)(3328))%(int)(1576)))*(var1+(int)(939)));
 break;
case 1:
var0 = (String)(((f3+"fmxnrgiwuyqpapkbsflnlbodzsiggxkdoydnpfdws")+(f3+"swnuuhaepncyrfbbwsxdcuudyynporzrtxpzo"))+(var0+"apjfeetcdijuclirks"));
 break;
case 2:
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 38");
 break;
case 3:
var1 = (int)(1963);
 break;
case 4:
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 43");
 break;
case 5:
var1 = (int)(938);
 break;
default :
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 51");
}
for(int i = 0; i < 0; i++){
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 54");
}
return (int)var1;

}


public static void main(String args[]){
NischitTest3 obj = new NischitTest3();
obj.NischitTestInterface2Method0((long)(2235),new NischitTest9(),(long)(3223),(long)(2352));
obj.NischitTest3method0(new NischitTest0(),(long)(1517));
obj.NischitTest3method1("jylmabekfoautoisofmhzihnhnlkdoykcmagjmjfuagmnnbpysofngdvky",new NischitTest2());
obj.NischitTest3method2((long)(2794),(long)(1847));
NischitTest3method3((int)(98),(long)(3328));
NischitTest3method4("cnownualhmocjkiyenediqpgwwiicymidejahmvikzctrcdgpkjmuuuldtdilwnmjdpxinjdszx",(int)(2874));
}

}