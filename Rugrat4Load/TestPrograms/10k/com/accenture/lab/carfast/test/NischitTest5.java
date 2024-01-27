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


public class NischitTest5 implements NischitTestInterface1, Runnable  {
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
int f0;
static String[] f1= new String[9];


public String NischitTestInterface1Method0(NischitTest13 var0, NischitTest4 var1){
 System.out.println("NischitTest5 - NischitTestInterface1Method0- LineInMethod: 9");
(new Thread(new NischitTest6())).start();
for(int i = 0; i < 14; i++){
 System.out.println("NischitTest5 - NischitTestInterface1Method0- LineInMethod: 19");
}
System.out.println("NischitTest5 - NischitTestInterface1Method0- LineInMethod: 27");
for(int i = 0; i < 0; i++){
 System.out.println("NischitTest5 - NischitTestInterface1Method0- LineInMethod: 42");
}
for(int i = 0; i < 21; i++){
 System.out.println("NischitTest5 - NischitTestInterface1Method0- LineInMethod: 59");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Perl\\eg\\__UIC__RUGRAT__Y2Euz.txt"));
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
bufferedWriter.append("C:\\Perl\\eg\\__UIC__RUGRAT__Y2Euz.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"qfbyzdvkubnasrhjawjonpyrcxfoejkvmxpwdgfvymfgbopdlycseunzgx";

}

public static Object NischitTest5method0(String var0, NischitTest12 var1){
 return (Object)var1;

}

public long NischitTest5method1(String var0, int var1, String var2, long var3){
 for(int i = 0; i < 42; i++){
 if( (((((f0*(int)(940))-(f0+(int)(1159)))>=(var1-(int)(2518)))||((var1+(int)(1996))!=(((var1/(int)(1622))*(var1+(int)(2376)))-(var1*(int)(2294)))))&&((var1/(int)(1177))>=(var1-(int)(302))))){
if( ((var2+var0)!=(var0+"xequsvcvftuibnjkqdznoyxtyyxkdvoaponuq"))){
if( ((f0*(int)(883))<(f0+(int)(855)))){
System.out.println("NischitTest5 - NischitTest5method1- LineInMethod: 8");
}
}
}
}
for(int i = 0; i < 2; i++){
 if( ((var1*(int)(2317))>(var1+(int)(1319)))){
System.out.println("NischitTest5 - NischitTest5method1- LineInMethod: 14");
}
}
switch((var1%(int)(1331))){
case 0:
var1 = NischitTest5method3(var1,null,var3);
 break;
case 1:
System.out.println("NischitTest5 - NischitTest5method1- LineInMethod: 23");
 break;
case 2:
var3 = NischitTest5method4(var0,var2);
 break;
case 3:
NischitTest5method4(var0,var0); break;
case 4:
var2 = (String)((var2+"ekdgavcrpnlldvgyfynfptbatpewuydvqvqlszgexzqqafdpsfrojocscuwcnrargwddxfzh")+((var0+var2)+(var0+"fjfcogwajrboeafenchaidtnkyyuliqgcmdfrjjvuucdmvqdvnavufsktijwe")));
 break;
case 5:
NischitTest5method3(var1,null,var3); break;
case 6:
var3 = (long)(((var3/(long)(480))-(var3*(long)(1829)))-(var3/(long)(2986)));
 break;
case 7:
System.out.println("NischitTest5 - NischitTest5method1- LineInMethod: 45");
 break;
case 8:
NischitTest5method4(var0,var0); break;
default :
f0 = (int)((var1-(int)(280))/(int)(1445));
}
if( ((var2+var0)==(var0+"ofocweezftybtjqkcypmfjvjhdnoohhsvohumgpkksrjxaylkackvpbkupitftoowtuintgu"))){
if( (((var0+"prollhejxbmmikukcidapndrzezajvwzjxdmyxygtrenlvsnjftvnlngzkxnecnqjdcminooeoajozcmwyrowwryknxjjwqzzbr")!=(var2+var0))||((var0+"dehoqbjthmdttgleoq")!=(var0+"zmaueyrinkorecyhmucjyrgjsnogfpivggfoknzixufpvqunakvqhuh")))){
NischitTest5method4(var2,var0);}
}
if( (((var2+"tzqotbrizmedocoizklqycvewetjzqpckwkeemgbijtkflgkskfmyklzgnscpogqqufdmbohgygi")+((var0+var2)+(var0+"tfzdvh")))==(var0+var2))){
if( ((var1-(int)(560))<((f0-(int)(988))*(f0%(int)(79))))){
var1 = NischitTest5method3(var1,null,var3);
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\strawberry\\cpan\\__UIC__RUGRAT__Q4fnI.txt"));
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
bufferedWriter.append("C:\\strawberry\\cpan\\__UIC__RUGRAT__Q4fnI.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var3;

}

public String NischitTest5method2(NischitTest6 var0, String var1){
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
if((((var1+"cgnnntpdpqttziqgyoousbyamnrdblynhvzonkepkwspweirvtfzyzwsjbyifltmzifoch")+((var1+"idemdtpxgmodrckqhcyftttqyxhwjpyqqzdwonyhfosvhauojmszff")+(var1+"ydajypbxahmfuscqnhyxtbckpfipuvvzuzaebutmxpedo")))==(var1+"jvbafdgymjqnefrizivnyvjoesgttrlclqodvpwl"))){
System.out.println("NischitTest5 - NischitTest5method2- LineInMethod: 4");
}
else{
 System.out.println("NischitTest5 - NischitTest5method2- LineInMethod: 6");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\java\\trustlib\\__UIC__RUGRAT__imsGD.txt"));
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
bufferedWriter.write("Writing line 60 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 61 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 62 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 63 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 64 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 65 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 66 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 67 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 68 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 69 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 70 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 71 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 72 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 73 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 74 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 75 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 76 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 77 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 78 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 79 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 80 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 81 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 82 to file");
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
bufferedWriter.append("C:\\WINDOWS\\java\\trustlib\\__UIC__RUGRAT__imsGD.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var1;

}

public int NischitTest5method3(int var0, NischitTest6 var1, long var2){
 if((((var2+(long)(2286))*(((var2*(long)(474))-(var2/(long)(1788)))*(var2+(long)(3122))))<(var2*(long)(2664)))){
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 4");
}
else{
 System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 8");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__aGyDP.txt"));
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
bufferedWriter.write("Writing line 60 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 61 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 62 to file");
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
bufferedWriter.append("C:\\__UIC__RUGRAT__aGyDP.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var0;

}

public long NischitTest5method4(String var0, String var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Python26\\Scripts\\__UIC__RUGRAT__aZuPh.txt"));
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
bufferedWriter.append("C:\\Python26\\Scripts\\__UIC__RUGRAT__aZuPh.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(212);

}


public static void main(String args[]){
NischitTest5 obj = new NischitTest5();
obj.NischitTestInterface1Method0(new NischitTest13(),new NischitTest4());
NischitTest5method0("ezeexavmqvvtlmoxgkasquvnpmokt",new NischitTest12());
obj.NischitTest5method1("bdyymyjbdtogmcroumdrxksqquhrdbkebhgygjepyjigawzvhohncrkyagngcoplphhfdrzlblhqexgjnetivlwjtfxjrt",(int)(2533),"vadmfenxrhgdkamsqfdrrokinkqdwudrhhgdaeylbdjeylohvawxkxhoglinmbfaejxrqivabmddny",(long)(1286));
obj.NischitTest5method2(new NischitTest6(),"xmegjlgswihyojzkhmnnrdrpjjanmhyavlpnkwdotqegsrpqlqzvaquzgb");
obj.NischitTest5method3((int)(290),new NischitTest6(),(long)(3183));
obj.NischitTest5method4("xolbsceopacvpnielkjijclfqpnoiptbkafqxnjnckqnuwsldpxwztcqtrjdrpgmbfvyxzkmnxhvnnzf","bewtxtmyxtpjgtomnd");
}

public void run(){
NischitTest5 obj = new NischitTest5();
obj.NischitTestInterface1Method0(new NischitTest13(),new NischitTest4());
NischitTest5method0("ezeexavmqvvtlmoxgkasquvnpmokt",new NischitTest12());
obj.NischitTest5method1("bdyymyjbdtogmcroumdrxksqquhrdbkebhgygjepyjigawzvhohncrkyagngcoplphhfdrzlblhqexgjnetivlwjtfxjrt",(int)(2533),"vadmfenxrhgdkamsqfdrrokinkqdwudrhhgdaeylbdjeylohvawxkxhoglinmbfaejxrqivabmddny",(long)(1286));
obj.NischitTest5method2(new NischitTest6(),"xmegjlgswihyojzkhmnnrdrpjjanmhyavlpnkwdotqegsrpqlqzvaquzgb");
obj.NischitTest5method3((int)(290),new NischitTest6(),(long)(3183));
obj.NischitTest5method4("xolbsceopacvpnielkjijclfqpnoiptbkafqxnjnckqnuwsldpxwztcqtrjdrpgmbfvyxzkmnxhvnnzf","bewtxtmyxtpjgtomnd");
}

}