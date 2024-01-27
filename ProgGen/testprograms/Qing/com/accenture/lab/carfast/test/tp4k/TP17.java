package com.accenture.lab.carfast.test.tp4k;


public class TP17 extends TP13 {


public static int TP17method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 switch((var7*(int)(38))){
case 0:
var7 = (int)(((var9%(int)(33))+(var7-var0))%(int)(72));
 break;
case 1:
System.out.println("TP17 - TP17method0- LineInMethod: 5");
 break;
case 2:
var9 = (int)((var5%(int)(58))-(var8+var9));
 break;
case 3:
var8 = (int)(((var0/(int)(70))%(int)(50))*(var3/(int)(22)));
 break;
case 4:
var6 = (int)((var10+var0)*((var9/(int)(25))%(int)(30)));
 break;
case 5:
TP17method2(var4,var1,var2,var7,var2,var3,var0); break;
case 6:
var4 = (int)(71);
 break;
default :
TP17method2(var10,var6,var7,var5,var3,var1,var7);}
if((((var10-var3)+(var1%(int)(39)))==(var2/(int)(57)))){
TP17method2(var2,var6,var0,var5,var10,var5,var8);}
else{
 System.out.println("TP17 - TP17method0- LineInMethod: 32");
}
return (int)var8;

}

public static int TP13method0(int var0, int var1, int var2, int var3, int var4){
 if( ((var3-var0)>=(var2-var0))){
System.out.println("TP17 - TP13method0- LineInMethod: 2");
}
if((((var0%(int)(59))<=(var0*var2))&&(((var2/(int)(22))>(var2-var3))&&(((var2%(int)(49))+(var2*var0))<((var0*var3)-(var2/(int)(24))))))){
var0 = TP17method2(var0,var1,var1,var0,var4,var4,var2);
}
else{
 System.out.println("TP17 - TP13method0- LineInMethod: 11");
}
if((((var2-var4)/(int)(64))<=(var0*var1))){
var1 = (int)((var1%(int)(32))-((var2*var3)-(var1%(int)(44))));
}
else{
 var2 = (int)(70);
}
switch((var4-(int)(42))){
case 0:
var1 = (int)((var1+var2)+(var0+(int)(47)));
 break;
case 1:
var0 = (int)(20);
 break;
case 2:
var3 = TP17method2(var1,var3,var0,var4,var2,var2,var2);
 break;
default :
System.out.println("TP17 - TP13method0- LineInMethod: 27");
}
if(((var4/(int)(68))>(var1-(int)(24)))){
System.out.println("TP17 - TP13method0- LineInMethod: 35");
}
else{
 System.out.println("TP17 - TP13method0- LineInMethod: 38");
}
return (int)var0;

}

public static int TP17method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var6/(int)(3))>=((var4*var2)-(var2+(int)(16))))){
if( ((var0*var5)<(var5+var1))){
if( ((var0*var4)==(var1-var3))){
var3 = (int)((((var5-var2)*(var6+var3))*(var0-var6))-(var3*var1));
}
}
}
for(int i = 0; i < 1; i++){
 System.out.println("TP17 - TP17method2- LineInMethod: 9");
}
if( ((var6-var3)>=(var5+var6))){
var5 = (int)((var4+var6)+((var2+var4)+(var0/(int)(75))));
}
if(((var5+var0)!=(var5*var3))){
var5 = (int)(1);
}
else{
 var3 = (int)(28);
}
if((((var1+var0)%(int)(24))<(var2*var3))){
System.out.println("TP17 - TP17method2- LineInMethod: 23");
}
else{
 System.out.println("TP17 - TP17method2- LineInMethod: 25");
}
if( ((var5-var1)>(var0/(int)(71)))){
if( (((var0/(int)(65))-((var0-var3)-((var6+var1)+(var0%(int)(23)))))<=(var1*(int)(64)))){
if( ((var4-var2)<(var3*var0))){
var5 = (int)((var5/(int)(41))+(var3-var2));
}
}
}
return (int)var0;

}


public static void main(String args[]){
TP17 obj = new TP17();
TP17method0((int)(10),(int)(65),(int)(51),(int)(21),(int)(3),(int)(23),(int)(33),(int)(69),(int)(52),(int)(11),(int)(58));
TP13method0((int)(28),(int)(35),(int)(52),(int)(7),(int)(4));
TP17method2((int)(0),(int)(76),(int)(64),(int)(19),(int)(51),(int)(3),(int)(65));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP17 obj = new TP17();
TP17method0(i7,i1,i10,i5,i6,i14,i11,i12,i8,i4,i3);
TP13method0(i12,i6,i0,i13,i7);
TP17method2(i4,i2,i8,i11,i7,i9,i1);
}

}