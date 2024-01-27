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


public class NischitTest7 implements NischitTestInterface1 {
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
static long f0;


public String NischitTestInterface1Method0(NischitTest13 var0, NischitTest4 var1){
 System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 6");
System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 20");
System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 48");
for(int i = 0; i < 31; i++){
 System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 55");
}
System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 67");
System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 78");
(new Thread(new NischitTest4())).start();
System.out.println("NischitTest7 - NischitTestInterface1Method0- LineInMethod: 85");
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\tmp\\apps\\Cygwin\\__UIC__RUGRAT__AYkZA.txt"));
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
bufferedWriter.append("C:\\tmp\\apps\\Cygwin\\__UIC__RUGRAT__AYkZA.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"nrifyrfsyclzuixkmcfhmtdskpiyfwwhfmcsaqujfdgknquxwyaxzjvazmszrizvwmqxugqkycrdwthiwojhxbnyrh";

}

public static long NischitTest7method0(String var0, NischitTest4 var1){
 if(((var0+"vjgaekxzlyrljmodiyellgrtbjpahoztxyyqbrzvlnjfmcekkmwdiaciuwmztzjishbwnfgltollmpqiaphjzfdwsyxuvgxmgiqh")==(var0+"xhso"))){
f0 = (long)(((long)(3377)*(long)(285))*((long)(1989)/(long)(1369)));
}
else{
 var0 = NischitTest7method1(null,var0);
}
return (long)(long)(544);

}

public static String NischitTest7method1(NischitTest10 var0, String var1){
 if( (((var1+"pyycdktaecqrpwpouwbgifaqminjqztmgvuqqlxldifjeyghgrincxgs")==((var1+"ecwecpfofznmelxcsctzuwwdw")+(var1+"qyhrwttdjmbouafqceysfszngqtqkrqnldemotxzyhksnazoctdjdeyluoflkzjdwcnwnmhunvchkmdlmvepiufqhwhfqv")))&&(((var1+"uhcniypkmfffwvkobbemldwnibglmuyfijklqpasprxxeikfwbyautypjobkxofbftwmhwrmvtdoqto")+(var1+"dtbxrcdwetdhgebkzhkcwipspbuafonrvtikfzizkjdpn"))!=((var1+"dcpjlnjngapdmwxvanrcfaskyiqqnytbymvvizpzwcxifhwyavhxewex")+((var1+"xtudqhnxlyrgawwbyikwkpimcodxerflvszougptqtaloobtwrzqfvjxm")+(var1+"onazvtyxaoddiizqwrgixzocfxxhacvngucbakrrunzfnrxtklklyfrbmmgpnruri")))))){
if( ((var1+"zokglezztallfydgjkxszovrawlpuqvdwjjgqxj")==(var1+"mzibgrmjnxdckwuzmlmmuwuxvnnprnydol"))){
if( ((var1+"vcplkpqwfsxpfbgsokcgjestclvppijunhmydorjubducynvhdfpnhdebzyiwcmtlwibceirvwseyr")!=(var1+"bednngzlofwhnuqnjvmydogvqcabmiasnuxcmpgbddat"))){
if( ((var1+"khsfoufohizxflkdlludkinzbihmwekoxhpjpewuaciasqcavaawabflqv")==(var1+"qbvloyhwciqechxrvprbolaaa"))){
if( ((var1+"eehnobsfjojcdw")==(var1+"nlitusqqceptsl"))){
if( (((var1+"lhzibkxmtvheewpzuhcnrcmihrcerjyxvuxcubbbfifmcnbbffrnfhjczghywclprenqofduhpdnj")+(var1+"hwa"))==((var1+"gzfcohdqrnisblbublivpbxyecqjaaeugmzjqensiclqrhgcsyvfjknruevpvzxngszrncqvkoxaqgeo")+(((var1+"hzjsqmtvslytjxafygphjueshsbkoqpwiigachpgifruo")+(var1+"zkhemskktdjvcagcxoetogosrmvrjvsxqpzbnohwmzrlcqkjwqnrtjy"))+(var1+"rfzxxbqskdcpbxzsvgdfiozffvrgkljovxyasxzuv"))))){
System.out.println("NischitTest7 - NischitTest7method1- LineInMethod: 12");
}
}
}
}
}
}
if( ((var1+"heexxwjaqffqkbgiyrxwqtmvrguyishzlbzhbyoqvpserwyqeevuyevznu")==(var1+"bvzxuzpcvzfxjansdbnwjsehssdhcffsdsffjnrljhauedtrgqbcleooczdocrnpvwozvqetyrmefzgxeupvofhfwwiltgrabq"))){
f0 = (long)(f0+(long)(2301));
}
if(((var1+"evmfznwczfpdfxyxjuxdyvltankdlguoqgrucoaiusgahveullpdzz")!=((var1+"fbbvvsejifsumfzmlubbwxzqymluykcvylqyqgylevjkeifjhem")+(var1+"zazwrmszardveplhpuvqvpepycwhvqfggbxpsoilcoprlnrtbijtkfngrlfqalmhpdvetlchgkndfngkyauomyvlsxbrgzs")))){
var1 = "jdepyupowidsvxedkuizhttckauchsysbywdolhxbqumxmfnqojaqhvrukutajywjnmzhsyeddkbuxfztjjz";
}
else{
 System.out.println("NischitTest7 - NischitTest7method1- LineInMethod: 22");
}
(new Thread(new NischitTest5())).start();
for(int i = 0; i < 1; i++){
 System.out.println("NischitTest7 - NischitTest7method1- LineInMethod: 26");
}
(new Thread(new NischitTest6())).start();
if(((var1+"iuiztyaqpfxuyhdpbxjimpysmwdiqhokteegoterzzrkjpiqoajah")==(var1+"jjxazzhdqqqdqhikkdsxbzytobgqsslydtqmcgubmganainoipyglhlgevihyfo"))){
System.out.println("NischitTest7 - NischitTest7method1- LineInMethod: 33");
}
else{
 var1 = (String)(var1+"ngpzzeedldpovunmkbhb");
}
for(int i = 0; i < 13; i++){
 var1 = (String)((var1+"duiqvwlmafodoxvxpkxnrtszhwxjzypbir")+((var1+"koifxhzgcpkzznsjgzmarxbbmilwssdyqbggossgoeetsbuqmshcayhdgtrvxhncq")+(var1+"dagjrjrwlawjtbwxiugnlounm")));
}
if(((var1+"uzetemsbmvlx")==(var1+"pftvtqyyaplaggbgihqqstkbh"))){
var0 = new NischitTest10();
}
else{
 var1 = "phcqanxdemhtzkikxdwxdrjendpwjjh";
}
if(((var1+"jzqutbacdcqtnycoximfqfswolsnzxvgwndxbpowlpexbznswptsvdcfxy")!=(var1+"xwanhpfommpdrgdplunnytqksmunvhucbstkcivdcakbtmflynjpqiesjhynprvothqwxwoqefk"))){
var0 = new NischitTest10();
}
else{
 var1 = "sdkfcipfxhacwvtnzoenpknkjnhicgldlrhmgiokszoujpjyeqozjnvbzoxlybkvujimtwlaohdvkbbmzjwhyxutzxskqie";
}
for(int i = 0; i < 32; i++){
 var1 = (String)((var1+"yyvchagtbboqtbbvfajhhqhdjtnhwvhkjpcsowhiqn")+(var1+"bwdyxxsimxwxhymvsv"));
}
return (String)var1;

}

public static long NischitTest7method2(long var0, NischitTest13 var1, long var2){
 if(((var2+(long)(1097))<(var2-(long)(2886)))){
var1 = new NischitTest13();
}
else{
 System.out.println("NischitTest7 - NischitTest7method2- LineInMethod: 5");
}
if( (((var2*var0)<(var0*(long)(454)))&&((f0+(long)(1516))>=(f0-(long)(1011))))){
if( ((((var0/(long)(652))!=(var0-(long)(2738)))&&((var2+var0)==(var2/(long)(964))))&&((f0+(long)(234))!=(f0-(long)(2850))))){
if( (((var0*var2)<((var0+var2)/(long)(821)))&&(((var0+(long)(2817))*(var0+(long)(330)))>(f0+(long)(2656))))){
if( ((((var0-var2)+((var2+var0)-(var2+(long)(2314))))%(long)(3424))!=(var0*var2))){
var2 = (long)(619);
}
}
}
}
if( (((f0+(long)(87))<=((var0*var2)+(var2-(long)(436))))&&((var2+(long)(1962))<(f0*(long)(1246))))){
var2 = (long)(2565);
}
return (long)var0;

}

public String NischitTest7method3(int var0, long var1, String var2, NischitTest9 var3){
 if( ((var0*(int)(41))==((var0*(int)(1306))%(int)(2365)))){
if( ((var0-(int)(3380))==(var0%(int)(1367)))){
if( (((var2+"eavmfqdfcsifloierzvgtofszrvpbwsqwmqrmidcoxnkecteamvpajsyryiyqrvtmqhkeexwlrs")==(var2+"ftgdshvfuephctsnzbnhkovvpfawedtuqsmhyvx"))||(((var2+"ggnkbrxornmkgprdjriambkkurvhhpjgyxsbn")+(var2+"mthgekgsygrarzpjsdrotbqayaxuihirvwrajoakmdsvlqnibeitudrwzqvxybqqluoyxzzeyrxgxlgrtdcoowfkfvvhmyknwp"))==((var2+"qotczpooaakylvpgdzvn")+(var2+"vvdjwmwjcmmzowasfxpjvmmid"))))){
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 6");
}
}
}
for(int i = 0; i < 15; i++){
 var2 = "ngcbnmbbziogmpbbvyqxizrcqbmlvmahxrhfbrhxrny";
}
if(((var2+"fzvfuehrbhbclcxknbarehsukubpfcyoifsgcwohxlpwijlrajkgvlaryrzjiyfwkzobkpgotryln")!=(var2+"eapoyllqifpzxlnfxmtjdwoubibmrxpbmo"))){
var0 = (int)(1934);
}
else{
 var3 = new NischitTest9();
}
if( ((var0*(int)(28))>=(var0-(int)(2568)))){
if( ((var2+"gl")!=((var2+"jiktxkowoshbrogsssgthzchwauwhlgnvqporwykcwnhgxdhjtiiufebgtfgmadrevkhnctwgafie")+(var2+"wiefyucspdfnpfbmuvyhz")))){
if( (((var0-(int)(2618))+(var0*(int)(2025)))<=(var0-(int)(2899)))){
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 23");
}
}
}
switch((var0-(int)(948))){
case 0:
var0 = (int)(((var0*(int)(2873))-((var0*(int)(1033))+(var0+(int)(1206))))-(var0/(int)(2384)));
 break;
case 1:
var1 = (long)((var1+(long)(422))%(long)(2310));
 break;
case 2:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 32");
 break;
case 3:
var1 = (long)((var1*(long)(2851))/(long)(1856));
 break;
case 4:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 41");
 break;
default :
var2 = (String)((var2+"tkvwxv")+(var2+"czynpiykygdotfmmjzputvgkctfbftmagwfxdeuoqvmwufnszfsquavrzzr"));
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
if( ((var1*(long)(3061))<=((var1+(long)(299))-(var1+(long)(1886))))){
var0 = (int)(1525);
}
switch(((var0+(int)(3102))+(var0-(int)(714)))){
case 0:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 52");
 break;
case 1:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 57");
 break;
default :
var3 = new NischitTest9();
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
if( (((var1-(long)(179))!=(var1*(long)(2619)))&&((var1-(long)(2959))==((var1-(long)(476))%(long)(3299))))){
if( (((var2+"azilisyioukkngdardlubrpwmegikqovfsrolqmaydmyvwviakbqcmazqqnajymrlrkpqypjqnmxjxmypdtngwxpguoh")!=(var2+"jvfsbnryiyyyvhhgnfljoxycyklrdnpmdbvunydnkyjgtvhzmsqqghmjciwuwjissesfqrated"))&&((((var2+"jxmeszvvcbqceapugzjbcbjeldssxufouwftldmruvymjxtojmecnqmfvxgglwratxdwfmsfnxzjrmhatavkoqmhntv")==(var2+"cjnvwcypctdrjcnkrsowuniqddzgpwophsedatty"))&&((var2+"glgxkxcwtylbdvijbbcivbbnnzxauzsnyg")!=(var2+"mwchxwtvzkauonhvlxzfsqrhfiscigtteuglhuooovzrsjyppzqbktavcohqojynrtcjcuahqjpon")))&&((var2+"gpwqwbrjnrcaeoerxyntapjnyrnrevelzqtrhwjudtqgiobosp")!=(var2+"pv"))))){
var0 = (int)((var0*(int)(2191))/(int)(3024));
}
}
if((((var2+"epkejjauciqjrnkqkafwmhkwnnwq")!=((var2+"ecroznwnapkqgzjxbjrjghrfseffoydvacw")+((var2+"xooxnyzlzjmjzybthestulwncufrlegbjlbriqzkjjpmcmixldjzfuslgxhmktcwiruwovrzxvfxtfktjnmtk")+(var2+"zhrozfqhkrksrlfqhgxrwsdojoedrxjywzwomfpzreeminqejmxaecwqromahk"))))&&((var2+"jzpckwljbwdhmjlhiocnzstskcuugxydvyylxez")==(var2+"ecxphvascbezfunvdxdebqwwfwj")))){
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 73");
}
else{
 var1 = (long)((var1*(long)(2575))-((var1/(long)(659))%(long)(184)));
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
for(int i = 0; i < 49; i++){
 if( ((var2+"duyzaqbzndkxozbxmemedgswmvwqeohfdalzdf")!=(var2+"pdyoerlpgwxhhrohzqcpnammadhgtshzluwxmhnyajzraaepjgjlmnubtedglcnpmhkhesxyqdjvuziep"))){
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 82");
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
switch((var0-(int)(2271))){
case 0:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 86");
 break;
case 1:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 89");
 break;
case 2:
var3 = new NischitTest9();
 break;
case 3:
var3 = new NischitTest9();
 break;
case 4:
var0 = (int)((var0-(int)(2074))*(var0-(int)(101)));
 break;
case 5:
var1 = (long)(3068);
 break;
case 6:
System.out.println("NischitTest7 - NischitTest7method3- LineInMethod: 104");
 break;
case 7:
var2 = (String)((var2+"fbflehuexdtiikzldudewqauzfcpccd")+(var2+"glaqgnkedjcxykxqqjrnjahdkrbpypnbkmcbwwoggkszwjosswxkbfehccktynxuhgyhuatgnrmfi"));
 break;
default :
var0 = (int)(1713);
}
return (String)var2;

}

public Object NischitTest7method4(int var0, long var1, NischitTest1 var2){
 if(((var1%(long)(1204))==((var1-(long)(691))-(var1*(long)(2819))))){
var0 = (int)(((var0/(int)(1159))-((var0%(int)(3211))+(var0+(int)(3043))))%(int)(2685));
}
else{
 var1 = (long)(((var1-(long)(2596))+((var1-(long)(3044))-(var1*(long)(1150))))-(var1%(long)(271)));
}
if(((var0+(int)(2298))>(((var0*(int)(1479))*(var0+(int)(927)))*((((var0%(int)(2464))+(var0/(int)(2304)))+(var0-(int)(1870)))*(var0+(int)(3392)))))){
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 10");
}
else{
 var2 = new NischitTest1();
}
if(((var1-(long)(2351))>=(var1-(long)(3416)))){
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 17");
}
else{
 System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 18");
}
if(((var1/(long)(172))<(var1+(long)(1829)))){
var1 = (long)((var1-(long)(1676))/(long)(416));
}
else{
 System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 26");
}
for(int i = 0; i < 34; i++){
 var0 = (int)(2758);
}
if((((var1/(long)(532))*(var1-(long)(2862)))<(var1-(long)(2185)))){
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 36");
}
else{
 var0 = (int)(490);
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
for(int i = 0; i < 30; i++){
 if( ((var0*(int)(707))>(var0*(int)(754)))){
if( ((var0%(int)(18))!=(var0-(int)(1358)))){
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 46");
}
}
}
switch((var0-(int)(2350))){
case 0:
var2 = new NischitTest1();
 break;
case 1:
var2 = new NischitTest1();
 break;
case 2:
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 57");
 break;
case 3:
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 63");
 break;
case 4:
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 70");
 break;
case 5:
var2 = new NischitTest1();
 break;
case 6:
var0 = (int)((var0+(int)(3124))*(var0-(int)(1567)));
 break;
case 7:
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 82");
 break;
case 8:
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 86");
 break;
default :
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 89");
}
if( (((var1+(long)(2458))>=(var1%(long)(1123)))||((var1+(long)(2329))>(var1/(long)(2055))))){
if( ((var0+(int)(500))>=(var0+(int)(751)))){
if( ((var1-(long)(1107))<=(var1+(long)(3174)))){
System.out.println("NischitTest7 - NischitTest7method4- LineInMethod: 98");
}
}
}
if(((var1*(long)(2499))==(var1/(long)(986)))){
var1 = (long)((var1*(long)(3051))+(var1-(long)(2065)));
}
else{
 var1 = (long)(((var1-(long)(199))%(long)(3069))+(var1-(long)(3176)));
}
if((((var0-(int)(2697))/(int)(687))>((var0*(int)(2427))*(var0+(int)(3386))))){
var0 = (int)(1901);
}
else{
 var0 = (int)((var0%(int)(1095))+(var0+(int)(3308)));
}
return (Object)var2;

}


public static void main(String args[]){
NischitTest7 obj = new NischitTest7();
obj.NischitTestInterface1Method0(new NischitTest13(),new NischitTest4());
NischitTest7method0("idcpihyogmxfzcealoxrjd",new NischitTest4());
NischitTest7method1(new NischitTest10(),"qrrsghansuievva");
NischitTest7method2((long)(1338),new NischitTest13(),(long)(2075));
obj.NischitTest7method3((int)(170),(long)(1074),"vsawftilmizyvzbhmpfnocdnyrepzslmgalnzepzeiznpkhuvonbjakildtrfleemexzgeytddjgr",new NischitTest9());
obj.NischitTest7method4((int)(1652),(long)(963),new NischitTest1());
}

}