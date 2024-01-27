package com.accenture.lab.carfast.test.tp2k;


public class TP16 implements TPInterface2 {


public int TPInterface2Method0(int var0, int var1, int var2, int var3){
 if(((var1+var2)>=(var3-(int)(28)))){
System.out.println("TP16 - TPInterface2Method0- LineInMethod: 4");
}
else{
 var0 = (int)((var2+(int)(45))/(int)(20));
}
if(((var2-var1)<=((var3+(int)(21))*(var0*var2)))){
System.out.println("TP16 - TPInterface2Method0- LineInMethod: 12");
}
else{
 System.out.println("TP16 - TPInterface2Method0- LineInMethod: 17");
}
return (int)var3;

}

public static int TP16method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if((((var6/(int)(48))%(int)(3))<=(var4%(int)(14)))){
TP16method2(var1,var1,var4,var1,var1,var5,var6,var1,var6,var4,var0,var6,var6);}
else{
 System.out.println("TP16 - TP16method0- LineInMethod: 5");
}
switch((var5-(int)(11))){
case 0:
System.out.println("TP16 - TP16method0- LineInMethod: 11");
 break;
case 1:
System.out.println("TP16 - TP16method0- LineInMethod: 17");
 break;
case 2:
var3 = (int)((var5%(int)(37))*(var3+var6));
 break;
default :
var1 = (int)((var6+(int)(41))+((var4*var0)+(var1-var4)));
}
return (int)var5;

}

public static int TP16method1(int var0, int var1, int var2, int var3){
 if(((var0+var3)>(var1-var2))){
var1 = (int)((var3*(int)(39))*(var0+(int)(18)));
}
else{
 TP16method2(var1,var2,var1,var3,var0,var1,var3,var1,var0,var1,var3,var2,var3);}
for(int i = 0; i < 0; i++){
 if( ((var0*var3)==(var0+var2))){
if( (((var0*(int)(22))-((var2+(int)(4))%(int)(38)))<=(var1+var2))){
if( ((((var1-var3)/(int)(15))<=(var2+var3))&&((var1+var2)<(var2+(int)(10))))){
var3 = (int)((var1-(int)(27))/(int)(46));
}
}
}
}
return (int)var3;

}

public static int TP16method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var5/(int)(13))){
case 0:
System.out.println("TP16 - TP16method2- LineInMethod: 2");
 break;
case 1:
var7 = (int)((var10+var2)+(var7+var9));
 break;
case 2:
var5 = (int)(48);
 break;
case 3:
var6 = (int)(32);
 break;
case 4:
var12 = (int)((var9-var5)*(var8*var1));
 break;
default :
var0 = (int)(var4+var9);
}
return (int)var0;

}

public static int TP16method3(int var0, int var1, int var2, int var3, int var4){
 if(((var4+var1)!=(var4+var0))){
System.out.println("TP16 - TP16method3- LineInMethod: 4");
}
else{
 var2 = (int)(38);
}
for(int i = 0; i < 1; i++){
 var0 = (int)(((var2-var4)+(var1/(int)(49)))+((var3-(int)(32))-(var1*var2)));
}
if( ((var1/(int)(23))<=(var2+var3))){
var1 = (int)(((var2/(int)(2))+(var0-var2))+(var0/(int)(14)));
}
return (int)var4;

}


public static void main(String args[]){
TP16 obj = new TP16();
obj.TPInterface2Method0((int)(41),(int)(38),(int)(31),(int)(0));
TP16method0((int)(6),(int)(19),(int)(1),(int)(6),(int)(32),(int)(26),(int)(40));
TP16method1((int)(35),(int)(19),(int)(47),(int)(14));
TP16method2((int)(5),(int)(43),(int)(48),(int)(43),(int)(43),(int)(49),(int)(11),(int)(17),(int)(6),(int)(24),(int)(43),(int)(12),(int)(24));
TP16method3((int)(23),(int)(19),(int)(16),(int)(2),(int)(29));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP16 obj = new TP16();
obj.TPInterface2Method0(i3,i6,i4,i1);
TP16method0(i9,i4,i8,i0,i5,i12,i1);
TP16method1(i0,i12,i5,i6);
TP16method2(i9,i5,i14,i2,i0,i7,i1,i13,i3,i6,i11,i10,i12);
TP16method3(i1,i8,i3,i2,i9);
}

}