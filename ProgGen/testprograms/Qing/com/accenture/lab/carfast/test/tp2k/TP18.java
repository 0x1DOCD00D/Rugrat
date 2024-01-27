package com.accenture.lab.carfast.test.tp2k;


public class TP18 {


public static int TP18method0(int var0, int var1, int var2, int var3){
 if(((var2/(int)(2))>=(var2*var3))){
System.out.println("TP18 - TP18method0- LineInMethod: 4");
}
else{
 System.out.println("TP18 - TP18method0- LineInMethod: 7");
}
return (int)var1;

}

public static int TP18method1(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 if( (((var2*var1)<=(var3/(int)(23)))&&((var2+var3)<((var0*var2)-(var3-var2))))){
System.out.println("TP18 - TP18method1- LineInMethod: 4");
}
}
for(int i = 0; i < 2; i++){
 System.out.println("TP18 - TP18method1- LineInMethod: 10");
}
if( ((var2*var3)<=(var1/(int)(26)))){
if( ((var1-(int)(14))>=((var3/(int)(39))-(var1-var2)))){
System.out.println("TP18 - TP18method1- LineInMethod: 15");
}
}
return (int)var1;

}

public static int TP18method2(int var0, int var1, int var2, int var3, int var4){
 if( (((var3+var4)!=(var4%(int)(6)))||((var2/(int)(4))>(var3/(int)(30))))){
if( (((var4*var0)>=((var1/(int)(37))+(var4*var1)))||((var1-var3)<(var0/(int)(27))))){
if( ((((var1-var0)*(((var4-(int)(6))*(var4+var0))*(var0*(int)(26))))>(var0*var4))&&((var1+var0)==(var0-(int)(4))))){
System.out.println("TP18 - TP18method2- LineInMethod: 6");
}
}
}
switch((var0%(int)(39))){
case 0:
System.out.println("TP18 - TP18method2- LineInMethod: 9");
 break;
case 1:
System.out.println("TP18 - TP18method2- LineInMethod: 13");
 break;
default :
System.out.println("TP18 - TP18method2- LineInMethod: 16");
}
return (int)var3;

}

public int TP18method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((var1%(int)(12))!=(var4-var0))){
var4 = (int)(37);
}
else{
 var1 = (int)((var5-var4)+(var3%(int)(37)));
}
if(((var1/(int)(9))<(var3/(int)(16)))){
System.out.println("TP18 - TP18method3- LineInMethod: 9");
}
else{
 System.out.println("TP18 - TP18method3- LineInMethod: 12");
}
return (int)var4;

}


public static void main(String args[]){
TP18 obj = new TP18();
TP18method0((int)(16),(int)(21),(int)(39),(int)(37));
TP18method1((int)(25),(int)(32),(int)(49),(int)(45));
TP18method2((int)(36),(int)(30),(int)(25),(int)(48),(int)(28));
obj.TP18method3((int)(7),(int)(26),(int)(3),(int)(13),(int)(31),(int)(40),(int)(43));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP18 obj = new TP18();
TP18method0(i7,i10,i13,i9);
TP18method1(i10,i13,i0,i6);
TP18method2(i1,i7,i6,i12,i9);
obj.TP18method3(i12,i8,i14,i4,i3,i10,i5);
}

}