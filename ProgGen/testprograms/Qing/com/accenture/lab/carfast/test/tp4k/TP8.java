package com.accenture.lab.carfast.test.tp4k;


public class TP8 extends TP4 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( ((var4+var2)<(var1/(int)(27)))){
System.out.println("TP8 - TPInterface1Method0- LineInMethod: 2");
}
switch((var2*(int)(14))){
case 0:
System.out.println("TP8 - TPInterface1Method0- LineInMethod: 9");
 break;
case 1:
var8 = (int)((var10*var7)/(int)(39));
 break;
case 2:
var9 = (int)((var8*var3)+(var5+var1));
 break;
case 3:
System.out.println("TP8 - TPInterface1Method0- LineInMethod: 18");
 break;
case 4:
System.out.println("TP8 - TPInterface1Method0- LineInMethod: 24");
 break;
case 5:
var5 = (int)(24);
 break;
case 6:
TP8method2(var7,var0,var8,var8,var9); break;
default :
var1 = (int)(var7+var0);
}
return (int)var5;

}

public static int TP8method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 if( ((((var2*var4)==(var1-var4))&&((((var3-var2)+(var0-var4))-(var4*(int)(71)))<(var3*(int)(34))))&&((((var1*(int)(47))+(var0/(int)(67)))==(var3*var4))&&((var1%(int)(61))!=(var1-(int)(4)))))){
if( ((var1+var2)<(var4/(int)(32)))){
if( ((((var1%(int)(57))*(var0*var2))<((var2%(int)(58))-((var2+(int)(73))*(var0+var4))))&&((var3+var1)>=(var2+var0)))){
if( (((var3*(int)(2))*((var4*var1)-(var4-var3)))>=((var2+var0)*(var4-var2)))){
if( ((var2/(int)(15))<(var4+var3))){
if( ((((var4+var2)!=(var1+var0))&&((var4*var2)>((var1*var2)+(var4-var0))))||((var2+var4)>=(((var3-var2)%(int)(18))*(var4*var2))))){
var4 = (int)((var0-(int)(26))+(var0/(int)(2)));
}
}
}
}
}
}
}
if( ((var2*(int)(20))==((var1+var4)-(var0*(int)(43))))){
System.out.println("TP8 - TP8method0- LineInMethod: 17");
}
for(int i = 0; i < 0; i++){
 if( ((var3+var4)==(var0%(int)(61)))){
System.out.println("TP8 - TP8method0- LineInMethod: 24");
}
}
return (int)var2;

}

public int TP4method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((var3-var2)>=(var4*var7))){
var6 = (int)((var0-var2)+(var3*var2));
}
else{
 TP8method2(var3,var2,var3,var6,var5);}
for(int i = 0; i < 2; i++){
 if( ((var7-var1)>=(var4*var3))){
System.out.println("TP8 - TP4method0- LineInMethod: 10");
}
}
if(((((var1+var0)-(var3-var6))==(var1/(int)(65)))&&((var5+var0)<(var0-var7)))){
System.out.println("TP8 - TP4method0- LineInMethod: 16");
}
else{
 var0 = (int)(71);
}
if( ((var6/(int)(66))!=(((var3-var4)*(var5+var0))/(int)(27)))){
if( ((var1/(int)(15))>=(var5+var7))){
if( ((var1*var6)<=(var0+var7))){
var5 = (int)((var6/(int)(61))+((var4-var3)-(var0*var3)));
}
}
}
return (int)var5;

}

public int TP8method2(int var0, int var1, int var2, int var3, int var4){
 switch((var0+var4)){
case 0:
System.out.println("TP8 - TP8method2- LineInMethod: 2");
 break;
case 1:
var4 = (int)(52);
 break;
case 2:
System.out.println("TP8 - TP8method2- LineInMethod: 9");
 break;
case 3:
var3 = (int)((var3*(int)(46))+(var1-var3));
 break;
case 4:
System.out.println("TP8 - TP8method2- LineInMethod: 18");
 break;
default :
System.out.println("TP8 - TP8method2- LineInMethod: 21");
}
switch((((var3*(int)(35))+((var4+(int)(8))-(var4*(int)(2))))/(int)(61))){
case 0:
var2 = (int)(22);
 break;
case 1:
var2 = (int)((var1+var2)%(int)(15));
 break;
default :
System.out.println("TP8 - TP8method2- LineInMethod: 29");
}
return (int)var0;

}


public static void main(String args[]){
TP8 obj = new TP8();
obj.TPInterface1Method0((int)(22),(int)(8),(int)(1),(int)(76),(int)(39),(int)(59),(int)(19),(int)(38),(int)(17),(int)(57),(int)(8),(int)(55));
TP8method0((int)(68),(int)(10),(int)(16),(int)(28),(int)(33));
obj.TP4method0((int)(52),(int)(72),(int)(58),(int)(55),(int)(53),(int)(3),(int)(52),(int)(6));
obj.TP8method2((int)(58),(int)(27),(int)(6),(int)(28),(int)(49));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP8 obj = new TP8();
obj.TPInterface1Method0(i4,i11,i5,i1,i12,i8,i10,i6,i0,i3,i2,i7);
TP8method0(i6,i9,i4,i5,i2);
obj.TP4method0(i7,i2,i5,i0,i4,i6,i9,i10);
obj.TP8method2(i12,i3,i11,i5,i0);
}

}