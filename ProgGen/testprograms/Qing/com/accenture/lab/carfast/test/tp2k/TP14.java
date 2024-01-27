package com.accenture.lab.carfast.test.tp2k;


public class TP14 extends TP9 {


public int TP14method0(int var0, int var1, int var2, int var3){
 if( ((var2-(int)(12))>((var0-var1)+((var1-var2)%(int)(47))))){
var2 = (int)((var2+var1)-((((var0-(int)(42))+(var1+var3))-(var0*var3))-(var0*var1)));
}
if((((var2*var0)<=(var0+(int)(39)))&&((var1+var3)==(var3-(int)(36))))){
TP14method2(var3,var3,var2,var1,var0,var1,var0,var2,var3);}
else{
 var0 = (int)(((var1%(int)(25))%(int)(43))-(var2+(int)(12)));
}
if( ((var3/(int)(46))>(var0+var2))){
if( ((var1-var2)>=(var2+var1))){
if( ((var2-var1)<=(var2+var0))){
TP9method2(var0,var3,var0,var1);}
}
}
return (int)var3;

}

public static int TP19method0(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 var3 = (int)((var3%(int)(42))+(var1*var3));
}
if( (((var1*var2)+(var0/(int)(11)))<(var3/(int)(25)))){
var1 = (int)(var0+(int)(20));
}
for(int i = 0; i < 2; i++){
 var0 = (int)(var3-var2);
}
if( ((var1+var2)<=(var3-(int)(45)))){
if( ((var3%(int)(28))>=((var1+var0)-(var2*(int)(16))))){
if( ((var3-var2)!=(var2/(int)(48)))){
var3 = TP9method2(var3,var2,var3,var0);
}
}
}
return (int)var1;

}

public int TP14method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if( ((var6/(int)(27))<=(var1%(int)(29)))){
if( ((var3%(int)(5))<=(((var5-var0)*((var4%(int)(27))%(int)(47)))*((var1/(int)(3))-(var7*var1))))){
if( ((var6+(int)(5))==(var3/(int)(4)))){
System.out.println("TP14 - TP14method2- LineInMethod: 6");
}
}
}
for(int i = 0; i < 1; i++){
 if( ((var3%(int)(20))!=(var7*var5))){
var4 = (int)((((var3+var7)-(var1+var6))+(var2-var5))/(int)(28));
}
}
return (int)var6;

}

public static int TP9method2(int var0, int var1, int var2, int var3){
 if(((var3*(int)(22))==(var1*var2))){
var3 = (int)((var2%(int)(18))+(var3-var1));
}
else{
 var3 = (int)(49);
}
switch((var0*(int)(36))){
case 0:
var1 = (int)((var2+var3)-(var0*var1));
 break;
case 1:
System.out.println("TP14 - TP9method2- LineInMethod: 10");
 break;
case 2:
System.out.println("TP14 - TP9method2- LineInMethod: 15");
 break;
case 3:
System.out.println("TP14 - TP9method2- LineInMethod: 18");
 break;
case 4:
System.out.println("TP14 - TP9method2- LineInMethod: 25");
 break;
case 5:
var0 = (int)((var1%(int)(29))+(var3-(int)(4)));
 break;
case 6:
System.out.println("TP14 - TP9method2- LineInMethod: 33");
 break;
case 7:
System.out.println("TP14 - TP9method2- LineInMethod: 37");
 break;
case 8:
var3 = (int)(var3%(int)(10));
 break;
default :
System.out.println("TP14 - TP9method2- LineInMethod: 45");
}
return (int)var2;

}


public static void main(String args[]){
TP14 obj = new TP14();
obj.TP14method0((int)(30),(int)(32),(int)(4),(int)(31));
TP19method0((int)(29),(int)(26),(int)(4),(int)(34));
obj.TP14method2((int)(16),(int)(40),(int)(33),(int)(8),(int)(2),(int)(26),(int)(42),(int)(3),(int)(21));
TP9method2((int)(26),(int)(13),(int)(44),(int)(18));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP14 obj = new TP14();
obj.TP14method0(i11,i7,i14,i13);
TP19method0(i0,i5,i4,i8);
obj.TP14method2(i1,i11,i5,i10,i4,i2,i12,i14,i0);
TP9method2(i10,i0,i3,i1);
}

}