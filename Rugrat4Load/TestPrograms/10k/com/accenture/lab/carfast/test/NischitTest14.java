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


public class NischitTest14 extends NischitTest12 {
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
static int[] f0= new int[11];
static NischitTest13 f1;
static String f2;
String f3;
long[] f4= new long[18];
static String[] f5= new String[13];


public static int NischitTest14method0(long var0, NischitTest11 var1){
 (new Thread(new NischitTest4())).start();
(new Thread(new NischitTest5())).start();
if( (((var0-(long)(222))+(((var0-(long)(3363))*(var0-(long)(2454)))*(var0-(long)(983))))!=(var0-(long)(2205)))){
f1 = new NischitTest13();
}
(new Thread(new NischitTest6())).start();
for(int i = 0; i < 46; i++){
 System.out.println("NischitTest14 - NischitTest14method0- LineInMethod: 130");
}
return (int)(int)(2328);

}

public static String NischitTest14method1(String var0, int var1, int var2, NischitTest3 var3){
 if( ((var0+"hbidmrskmthtohugzepztzdjlzaxwkphgbzdsbxeisqdnkbrdbktecchrltjqaitvhwkyhwqhpxubz")==(var0+"ncgpvxlwczuwoobpbkjxpbgztxuuxbhftbnmunuppnyjmgbhsbjrpaeuwqkv"))){
if( ((f0[0]-f0[5])==(var2-(int)(1891)))){
if( ((f2+"qwytuvkcoqisnsphuxbqduwhwmzuedrjlortsuparzitkxgbzjuwucskjjggmth")==(var0+"juoycdpwenib"))){
if( ((var0+"xsksaehimejksmxkzlcpnopymqwxeusgtpdszdnwurrz")==(var0+"bgcubkyievptcdgacpizmnzvtwhgyglk"))){
if( ((f0[7]%(int)(3069))<((var2-(int)(964))-(((var1*var2)/(int)(2710))/(int)(621))))){
if( ((var0+"gabrapslhxlpzezjrhuxyfhjozyxivxvewzxerfyxigqeilgdjkidf")==(var0+"knxdohsbjadjzwlwxyqmz"))){
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 12");
}
}
}
}
}
}
for(int i = 0; i < 37; i++){
 if( ((var0+"xjgfjsoqpupsuqxyjwonyvovgbywedrcxkecuumqwflsuewnvglvtpxptmvzqwql")==((var0+"zgpfnfixgyfldykztxkrxgembgp")+(var0+"zmtpaousxyqtkpvdjsytmystnxktqxkgrixssdfhmhph")))){
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 21");
}
}
if(((var0+"ymxjmqkufaejyodkrvhfjvkjcycnolcfkzzftabrohyqgidspgcgorklqfijlyufctmllbmykgehcekltyvfphidp")==(var0+"djpcogisdpzewcnmtypqvokozfqynnfvtiqjrjgqxpti"))){
f5[7] = (String)(var0+"lyhhmojxdckllirybrotkgygrwrkyzecgdanzkvmmtqecgxxfnyxnooqxlsselxyhubkbrvv");
}
else{
 System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 60");
}
switch((var1+f0[10])){
case 0:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 63");
 break;
case 1:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 67");
 break;
case 2:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 72");
 break;
case 3:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 79");
 break;
case 4:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 83");
 break;
case 5:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 90");
 break;
case 6:
NischitTest14method2(var0,var0); break;
case 7:
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 100");
 break;
default :
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 103");
}
if( (((var0+"fieurnjakphfydqmibuqsezwmtuahdrnpdcbbwrjbtcqmplgpr")==(var0+"aswatgpqmprekgvoxfmutlaphgfqzjqkrlewuswztjcaqdmdjcxfnoohkg"))&&(((f2+"kqyvijviquekmjeqlqkexvhkbbmmuuwruwlnwdpfzpkwhhvbxrqeddvmmpqyvjvcsbuvwwptctqhdssasiv")+(f2+"mfjdknfdnv"))!=(var0+"gaunsgxjjyjrlhttuktsuhfwufedrtuqwxtrfjpqxiagfwxvyhzktkjcwrpnbmokmntlsmksajkkgvxvq")))){
System.out.println("NischitTest14 - NischitTest14method1- LineInMethod: 109");
}
return (String)var0;

}

public static String NischitTest14method2(String var0, String var1){
 if(((f2+f5[12])==(var1+var0))){
System.out.println("NischitTest14 - NischitTest14method2- LineInMethod: 4");
}
else{
 var0 = (String)(((var1+var0)+(var1+"hxsmclosjojnmsdwgihxcu"))+(var1+"esssaconny"));
}
if(((var1+"vczgrshstekayjxvfhgrgwrfyemjjhnnwdqkhxvgzjgmbkkifnqmvyutmxzwaerpbubrtofiytjthjptjcfqhmuryvpjpxawap")!=(var1+var0))){
System.out.println("NischitTest14 - NischitTest14method2- LineInMethod: 13");
}
else{
 System.out.println("NischitTest14 - NischitTest14method2- LineInMethod: 15");
}
if( ((var0+var1)!=((var1+"cezibouonuxtxwfiregykxodrukksgnkoabu")+(var0+var1)))){
var0 = (String)((var0+var1)+(var1+"bmfjvonarvwwfelbwewodkepwdsmiehiegzg"));
}
for(int i = 0; i < 49; i++){
 if( (((var0+"gtmztygtrigvgcpzjzbqb")+(var1+"blmqwupqjqkpzxxveimdtjuuiynprdcvvqnrue"))==(var0+var1))){
if( ((var1+"nnyplcttprtivqcctgkqcpnsdfgyknrdzbiizwwltypnbcnncuaoowccqkkk")==(var0+"btavncgldhyoafx"))){
f0[8] = (int)(((int)(27)/(int)(3075))*(((int)(3361)/(int)(3354))+((int)(2644)*(int)(1264))));
}
}
}
if( ((f2+f5[1])==(var1+"njgogoktdesbgfhjbnspoqsluiexlcctympwjeyptksucizzblvhjwggmhqcxckishyfuk"))){
var0 = "kaxokbxztzgbzsodeicqgntakqqsotrioirnsjxmiwznobephacryjcshfhxnmdymhjcisjeotbhasaugtjn";
}
if(((var0+"gmrizwpjevlfllfiqyaamxsrywjcpmjxqiqqllevknyg")!=((var1+var0)+((var1+var0)+((var1+"izfdankwkbhzmtvyfqmfdnxgvkcno")+(var1+"mjfkawklhoeouivyohxgzmqllyiodxtwcoftybzwaiqjocmvljsru")))))){
f1 = new NischitTest13();
}
else{
 System.out.println("NischitTest14 - NischitTest14method2- LineInMethod: 68");
}
return (String)var0;

}

public Object NischitTest12method0(int var0, String var1, NischitTest2 var2){
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
if((((var1+"glmdumggnugbhotapsripdrmtlktfqqtzhupjnsycvzafivudfxlvgollvdllmzzmfxuxrhbfzgjyyjjxctooqppmsgobcz")!=(var1+"wlvvdgcsurvrvbjgvgmoedgbaifqt"))&&(((var1+"khxupgkzvnwwoznzhieviwjadlzezbvbsnhuptjmysfezigkxmexqktpnpj")!=((var1+"imrlpnpwabjxvgmszcythirkyjsasgtofvdoywoqe")+((var1+"vvoulzissocdebjygslhfebdtivt")+(var1+"xnxcabftwgvgkdrnlkxrjasir"))))&&((f3+"vxkecchovo")!=(var1+"ttpvreiszafiuqhewglmbitrghe"))))){
System.out.println("NischitTest14 - NischitTest12method0- LineInMethod: 4");
}
else{
 System.out.println("NischitTest14 - NischitTest12method0- LineInMethod: 9");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\tmp\\apps\\Cygwin\\1.5.24-2\\http%3a%2f%2fwww.gtlib.gatech.edu%2fpub%2fcygwin%2f\\__UIC__RUGRAT__7wHPF.txt"));
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
bufferedWriter.append("C:\\tmp\\apps\\Cygwin\\1.5.24-2\\http%3a%2f%2fwww.gtlib.gatech.edu%2fpub%2fcygwin%2f\\__UIC__RUGRAT__7wHPF.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
if( ((var1+"cvvobkzfdxfwgg")!=(var1+"lcfxrecpqiamozxyhwfucjmprzkecrowuoezuqrejtstsxfkbgvyjh"))){
if( ((((var1+"pkepuujnwefaoehdsdnmpaismzznnkidtsfyifsjqmofeqgvxzxjcgqqpiwnizjfj")==(f3+"fjeogpai"))||((var1+"zwxyyanxppgquwfgfjxiigeqzqhnhxpxaitlejezkierfjhrgvtfmpvzrocrexxkpgk")==(var1+"didcttgaoabhpfhygeqx")))&&((((var1+"vttkxxxofqmilcgahetalxkrevvnntknfuxgefzwpemdmblyxmjfsmannfnnacigf")+(var1+"juhnqxggcrkoyyxfwtlaqleavpsyrscozgpvzokchuxjbcmgejupzzahbbbpgzakuxy"))==(var1+"ujtbwggotysyzoqmmgidlpthkxiaqiwqauveeckklpukymoahcgeykmujjftblqdnitav"))&&((f3+"qyocmhvnjfbzsfgxt")!=(var1+"qmfrditfylpkwtwyqmfqtaxkiebqgvlxrdmbkuzeau"))))){
if( ((var0+(int)(3194))<=((var0/(int)(1913))*(var0-(int)(1705))))){
if( ((var0+(int)(1990))>=(var0/(int)(922)))){
if( ((var0-(int)(1339))>((var0*(int)(1203))+((((var0/(int)(1854))-(var0+(int)(2495)))-(var0/(int)(1809)))-(var0+(int)(666)))))){
if( (((var0-(int)(1831))<=(var0-(int)(3059)))&&(((var0*(int)(2447))>(var0+(int)(1684)))||((var0+(int)(1714))==(var0/(int)(1049)))))){
System.out.println("NischitTest14 - NischitTest12method0- LineInMethod: 96");
}
}
}
}
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\Registration\\CRMLog\\__UIC__RUGRAT__MIYy6.txt"));
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
bufferedWriter.append("C:\\WINDOWS\\Registration\\CRMLog\\__UIC__RUGRAT__MIYy6.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var2;

}

public Object NischitTestInterface2Method0(long var0, NischitTest9 var1, long var2, long var3){
 if( (((var2%(long)(3117))-(var0*var3))!=(f4[0]-f4[14]))){
if( ((f4[17]*f4[15])<(var2+var0))){
if( ((f4[2]-f4[12])>(var0-(long)(790)))){
if( ((((var0-var2)+(var2-(long)(3133)))+(var2*var0))>=(f4[2]*f4[15]))){
if( (((var0+(long)(3110))+(var0*(long)(2790)))==(var2/(long)(590)))){
if( ((var3+var2)!=(f4[17]+f4[13]))){
System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 12");
}
}
}
}
}
}
for(int i = 0; i < 28; i++){
 if( (((var2+var0)*(var0/(long)(49)))>=(var0-var3))){
var3 = (long)(3037);
}
}
if( ((var0-(long)(2701))<=(f4[0]-f4[13]))){
var2 = (long)(((f4[1]*f4[14])*(f4[0]+f4[14]))+(var0-var2));
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
if(((((var2/(long)(778))%(long)(840))<=((var3-var0)*(var0/(long)(2083))))&&((((var2-var3)+(var3-var2))*(var0-(long)(2990)))==(var0%(long)(2442))))){
var3 = (long)(1743);
}
else{
 System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 27");
}
if(((var0*var2)!=(f4[0]+f4[10]))){
System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 33");
}
else{
 NischitTest14method2("nxhnzszqjgrctslcsrynsluljurbdegprqbb","soxggnmhq");}
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
if(((var2/(long)(140))<=(f4[13]-f4[7]))){
System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 42");
}
else{
 var0 = (long)(f4[5]+f4[2]);
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\temp\\__UIC__RUGRAT__XUmRf.txt"));
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
bufferedWriter.append("C:\\temp\\__UIC__RUGRAT__XUmRf.txt");bufferedWriter.newLine();
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
if( ((var0-var3)<(var0+(long)(2978)))){
f3 = (String)(("tayqjdlttxnwbnjgkhqmitmbkygwemgdhakwcsmsltkjuewsihsxbzdqwuszijgudffncb"+"bxpoojygv")+((("xwygldndfttanjqdjwqsfxohctpgvn"+"xudcqtigvjsxjqjwtmuuplsktpxvhyomslpqdqyvxccxmnrvxgrmlyqowgdfducjywqzneggvegnixht")+(("wkelzmfkic"+"hvhbcjwzvyjpdwcljhqsowxyciovmxyipfktfpmnpwscaa")+("rvvfjhliabbrzjxoirbzexezbibpfznhnadychs"+"miaccrdowjcycjcexcnpexcqhxwvxlohzlegqndpmjozbpvgxgpbndkmdzcuoxvikppbkdtdpwzzyeyktqhoidjkhitbimivo")))+("ynzsmymgfttwyvida"+"fjzigccwqmmeesmzedsnnvdibrvyhkcwrqoybupqayjqhzxduqxlrgtkrpsqgkqlmudbwf")));
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
for(int i = 0; i < 22; i++){
 System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 98");
}
for(int i = 0; i < 42; i++){
 if( ((var2/(long)(1970))<(var0+(long)(303)))){
var3 = (long)(1115);
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
if( ((f4[1]-f4[11])<=(var3-var2))){
var0 = (long)(3200);
}
if(((var0*var2)>(var2-(long)(2267)))){
System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 110");
}
else{
 f3 = (String)(("jyalvtayotmgurwxzmqoskigazyxgffkzqmwgonhfu"+"jelvohpbqtybpsjhakhhjsajsimouthymrognkzhhgawrtlopyoywmfcdyegnrrtayailigronwaameepklyarmeyqguttmrwqh")+(f3+"opnrwnozivffptrjchxcpbevtzdvkn"));
}
if((((var3/(long)(2623))==((var2-var3)+(var0-var2)))&&((f4[4]%(long)(948))!=(var0-(long)(135))))){
System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 120");
}
else{
 System.out.println("NischitTest14 - NischitTestInterface2Method0- LineInMethod: 122");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\xampp\\MercuryMail\\RESOURCE\\__UIC__RUGRAT__vmPE6.txt"));
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
bufferedWriter.append("C:\\xampp\\MercuryMail\\RESOURCE\\__UIC__RUGRAT__vmPE6.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}


public static void main(String args[]){
NischitTest14 obj = new NischitTest14();
NischitTest14method0((long)(2523),new NischitTest11());
NischitTest14method1("symtjjndbifuqgllwomgeaajsnwgbvgxvfeuqqqwdbd",(int)(1606),(int)(1827),new NischitTest3());
NischitTest14method2("ltzxgsbhmjwpzfeoduexwidwcgjdxpbyzxswxakeaehydkzwojvoiybmxdcqusatpmlvboowcixrndmnp","axohncovvlsepehszgegdyhdokvwjdqrxyjlpaiopbbyvinsxqakwrrajawygizpcqtetagzmubmrckiquxtjaj");
obj.NischitTest12method0((int)(849),"jnhonchbcjfldrddlsangmgdjizzmnxjcqmqhwgjmvr",new NischitTest2());
obj.NischitTestInterface2Method0((long)(3143),new NischitTest9(),(long)(3116),(long)(1196));
}

}