package com.accenture.lab.carfast.test.tp2k;


public class TP11 extends TP7 {


public int TP11method0(int var0, int var1, int var2, int var3){
 if( ((var1+var2)<=(((var0*var1)*(var2/(int)(16)))+((var1*var0)-(var1-var3))))){
TP11method2(var1,var1,var2,var3);}
if((((var1*var3)!=((var3%(int)(45))+((var3/(int)(38))*((var0*var1)-(var1-var3)))))&&((var0%(int)(18))<=(var0*var1)))){
var3 = (int)(var1/(int)(5));
}
else{
 System.out.println("TP11 - TP11method0- LineInMethod: 8");
}
for(int i = 0; i < 4; i++){
 var3 = (int)(((var1-var2)*(var2/(int)(17)))-(var0+var2));
}
return (int)var0;

}

public int TP7method0(int var0, int var1, int var2, int var3, int var4){
 if(((var3+(int)(23))==(var3-var1))){
System.out.println("TP11 - TP7method0- LineInMethod: 4");
}
else{
 System.out.println("TP11 - TP7method0- LineInMethod: 7");
}
switch(((var1+(int)(40))/(int)(37))){
case 0:
System.out.println("TP11 - TP7method0- LineInMethod: 10");
 break;
case 1:
var1 = (int)((var2-var0)*(var2*var0));
 break;
case 2:
var0 = (int)(46);
 break;
case 3:
var2 = (int)((var4/(int)(43))%(int)(21));
 break;
case 4:
var4 = (int)(31);
 break;
default :
System.out.println("TP11 - TP7method0- LineInMethod: 24");
}
return (int)var1;

}

public static int TP11method2(int var0, int var1, int var2, int var3){
 if( ((var0*var3)>(var2+(int)(24)))){
if( ((var3-var0)>=(var1%(int)(11)))){
var3 = (int)(((var1*var3)+(var0%(int)(26)))*(var0+var3));
}
}
for(int i = 0; i < 1; i++){
 System.out.println("TP11 - TP11method2- LineInMethod: 7");
}
switch((var3/(int)(18))){
case 0:
System.out.println("TP11 - TP11method2- LineInMethod: 13");
 break;
case 1:
var0 = (int)(13);
 break;
case 2:
System.out.println("TP11 - TP11method2- LineInMethod: 20");
 break;
case 3:
System.out.println("TP11 - TP11method2- LineInMethod: 27");
 break;
default :
var2 = (int)(39);
}
return (int)var3;

}

public int TP7method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var2+var5)<((var2-var3)-(var3*var2)))){
var4 = (int)(((var5-var3)*((var4+(int)(42))-(var3*var5)))%(int)(17));
}
switch((var4+(int)(34))){
case 0:
System.out.println("TP11 - TP7method2- LineInMethod: 5");
 break;
case 1:
var4 = (int)((var4-var6)*(((var0*var4)*(var5%(int)(43)))-(var4+var1)));
 break;
case 2:
System.out.println("TP11 - TP7method2- LineInMethod: 12");
 break;
case 3:
System.out.println("TP11 - TP7method2- LineInMethod: 19");
 break;
case 4:
var2 = (int)((var3+var1)-(var3+var1));
 break;
case 5:
System.out.println("TP11 - TP7method2- LineInMethod: 26");
 break;
case 6:
System.out.println("TP11 - TP7method2- LineInMethod: 33");
 break;
case 7:
var2 = (int)(26);
 break;
case 8:
System.out.println("TP11 - TP7method2- LineInMethod: 42");
 break;
default :
var5 = (int)((var3/(int)(35))+(var4+(int)(44)));
}
return (int)var6;

}


public static void main(String args[]){
TP11 obj = new TP11();
obj.TP11method0((int)(1),(int)(2),(int)(12),(int)(38));
obj.TP7method0((int)(18),(int)(34),(int)(34),(int)(28),(int)(47));
TP11method2((int)(5),(int)(42),(int)(40),(int)(17));
obj.TP7method2((int)(25),(int)(34),(int)(1),(int)(29),(int)(13),(int)(1),(int)(23));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP11 obj = new TP11();
obj.TP11method0(i14,i8,i3,i9);
obj.TP7method0(i11,i1,i8,i13,i6);
TP11method2(i6,i14,i7,i3);
obj.TP7method2(i10,i9,i14,i7,i4,i0,i1);
}

}