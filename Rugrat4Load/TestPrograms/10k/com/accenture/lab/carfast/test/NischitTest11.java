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


public class NischitTest11 {
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
String[] f0= new String[12];
static long f1;


public static String NischitTest11method0(NischitTest3 var0, String var1, NischitTest8 var2, int var3){
 (new Thread(new NischitTest4())).start();
(new Thread(new NischitTest5())).start();
switch((var3/(int)(2662))){
case 0:
var3 = (int)((var3+(int)(1594))*(var3-(int)(2662)));
 break;
case 1:
var0 = new NischitTest3();
 break;
case 2:
var3 = (int)(846);
 break;
case 3:
NischitTest11method3(var1,var3); break;
case 4:
var1 = NischitTest11method4((long)(3431),(long)(916),var1);
 break;
case 5:
System.out.println("NischitTest11 - NischitTest11method0- LineInMethod: 119");
 break;
case 6:
f1 = (long)(((long)(1079)*(long)(2866))/(long)(3382));
 break;
case 7:
System.out.println("NischitTest11 - NischitTest11method0- LineInMethod: 126");
 break;
case 8:
var3 = (int)(2519);
 break;
default :
var3 = (int)(((var3*(int)(2060))+(var3%(int)(67)))%(int)(117));
}
return (String)var1;

}

public String NischitTest11method1(long var0, String var1, int var2, long var3){
 for(int i = 0; i < 4; i++){
 var0 = (long)(var3+var0);
}
if( ((var1+"ugwocfilzrynidkkpumhwwrfwljkphjcwaasihxfgrqzci")!=(var1+"fmnbgdwsmbibgnfqfembygdkwklotcdznkmrgmaivnhjjarvaowuqfqxvfbyabgqstnmqhlgtpwajiiapanxdldaxxghmiviqlg"))){
System.out.println("NischitTest11 - NischitTest11method1- LineInMethod: 6");
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
if( (((var1+"krzrnxktqncbznnjqhyxiufpzspncttoxtzvxtyglrdmndwsijkvhhepsypfzvpfarvopbmge")!=(var1+"cnrqxqfmhqhnluyjzcgtayan"))&&((var1+"vojondhvaodwyrgfqfjckhdntrrasdffnfdihfxpirbvrrpldbshzzcgfztvthakjwzjibdpgabaudnpgn")==(var1+"rblshmaqydpplttovzctmfnfvzcwluvetasalmktdhpqlcaqzulykfiqbimskurpuxjknuzgpufxadb")))){
if( (((var0*(long)(1007))<(var3*(long)(2825)))||(((var3-(long)(2391))>=(var0/(long)(1295)))||((var0%(long)(107))!=(var0*(long)(1384)))))){
NischitTest11method2(var1,var1);}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Config.Msi\\__UIC__RUGRAT__eMqWL.txt"));
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
bufferedWriter.append("C:\\Config.Msi\\__UIC__RUGRAT__eMqWL.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
if( ((((var2*(int)(31))%(int)(1589))+((var2/(int)(638))%(int)(1706)))<(var2%(int)(1754)))){
if( ((((var2*(int)(2470))/(int)(2944))<=(var2%(int)(5)))&&(((var2%(int)(2871))-(var2+(int)(2447)))!=(var2+(int)(3401))))){
if( (((((f0[11]+f0[10])+(f0[8]+f0[4]))+(f0[2]+f0[8]))+(f0[5]+f0[2]))!=(var1+"qasuwrulrdbeogdhaolskeszjqnzhzluneffukrmnxcdefjsteijykkrvdnrwhtzyvv"))){
System.out.println("NischitTest11 - NischitTest11method1- LineInMethod: 134");
}
}
}
return (String)var1;

}

public Object NischitTest11method2(String var0, String var1){
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
(new Thread(new NischitTest6())).start();
for(int i = 0; i < 44; i++){
 System.out.println("NischitTest11 - NischitTest11method2- LineInMethod: 2");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\All Users\\__UIC__RUGRAT__yjeMhP3.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\All Users\\__UIC__RUGRAT__yjeMhP3.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\xampp\\perl\\lib\\__UIC__RUGRAT__I5ya4.txt"));
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
bufferedWriter.append("C:\\xampp\\perl\\lib\\__UIC__RUGRAT__I5ya4.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)null;

}

public static long NischitTest11method3(String var0, int var1){
 if((((var1-(int)(418))==(var1+(int)(3021)))&&(((var1*(int)(2051))!=(var1%(int)(2827)))&&((var1%(int)(3103))>(var1-(int)(679)))))){
var0 = (String)((var0+"nlhkuqyzcywbgjnzyqjsttkwpicwxwypjuyrusogochcunoakrouazpebygrgiropksjrtqyradacxrgprexxl")+(var0+"hzmzbytlvzymucbsctcqfmytrpekutsfhuxwjvvybdzzmceoweijeihpzdin"));
}
else{
 f1 = (long)((long)(1776)*(long)(3427));
}
switch(((var1-(int)(1112))*(var1-(int)(883)))){
case 0:
System.out.println("NischitTest11 - NischitTest11method3- LineInMethod: 8");
 break;
case 1:
f1 = (long)(((long)(1447)/(long)(1181))-((long)(1601)*(long)(3433)));
 break;
case 2:
var1 = (int)((var1%(int)(2337))%(int)(797));
 break;
case 3:
System.out.println("NischitTest11 - NischitTest11method3- LineInMethod: 20");
 break;
case 4:
var0 = "ecvkjozytelpyqyjvaqhbsctakeldgjmdamf";
 break;
default :
System.out.println("NischitTest11 - NischitTest11method3- LineInMethod: 29");
}
return (long)(long)(2329);

}

public static String NischitTest11method4(long var0, long var1, String var2){
 if( ((var0+(long)(2693))<((var0+var1)*((var1+var0)%(long)(360))))){
if( ((var0*(long)(3025))<=(var1+(long)(3051)))){
if( ((f1%(long)(3153))<=((f1*(long)(1498))+((f1*(long)(28))*(f1+(long)(688)))))){
var0 = (long)(972);
}
}
}
return (String)var2;

}


public static void main(String args[]){
NischitTest11 obj = new NischitTest11();
NischitTest11method0(new NischitTest3(),"rzxvupkvkvnvqbjcpdrstslrcoqkizrniauvaumvwieamobkbrzuxnycfosacubpbbygwkpign",new NischitTest8(),(int)(2110));
obj.NischitTest11method1((long)(1654),"vxamcwyeekhldddb",(int)(530),(long)(2477));
obj.NischitTest11method2("rmszjyaomivlhwiwdterebckqprdnvchmbbvooonniwgotabpnv","jfoawriyqpnyfppbosqwdbuwvpxptzfvwfn");
NischitTest11method3("aovmtlubghvujftlfnhylifslnujcucyfgxlimlteut",(int)(1825));
NischitTest11method4((long)(2703),(long)(2270),"nehmexpmbeuncsvtgaxu");
}

}