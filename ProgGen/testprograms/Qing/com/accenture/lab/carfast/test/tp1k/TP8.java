package com.accenture.lab.carfast.test.tp1k;


public class TP8 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( (((var7/(int)(1))+(var7/(int)(52)))<(var6*var9))){
if( (((var1%(int)(26))<=(var6*(int)(20)))&&((var8+var0)>=((var5-var6)%(int)(58))))){
System.out.println("TP8 - TPInterface1Method0- LineInMethod: 4");
}
}
return (int)var6;

}

public int TPInterface1Method1(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 4; i++){
 if( ((var0+var4)<=(var2-var4))){
if( (((var3*var2)<=(var0+var2))||((var2-var4)<=(var4/(int)(62))))){
if( ((((var3-var2)-((var2-var4)%(int)(31)))-((var1%(int)(33))-(var3*var2)))>=((var2%(int)(31))%(int)(61)))){
if( (((var0%(int)(47))<((var0-var2)-(var2+var0)))||((var4-var3)!=(var2+var1)))){
System.out.println("TP8 - TPInterface1Method1- LineInMethod: 10");
}
}
}
}
}
return (int)var2;

}

public int TPInterface1Method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 1; i++){
 if( (((var1-var2)<(var4+var0))||((var7-var3)==(var4+var8)))){
if( ((((var7+var5)+(var8-var1))-(var5-var2))<=(var7+var6))){
if( ((var6+var1)<=(var8*var3))){
if( ((var1%(int)(6))<=(var5-var1))){
System.out.println("TP8 - TPInterface1Method2- LineInMethod: 10");
}
}
}
}
}
return (int)var2;

}

public int TPInterface1Method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 1; i++){
 var4 = (int)(var1-var3);
}
return (int)var5;

}

public int TPInterface1Method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((var7+var2)!=((var5-var1)/(int)(16)))){
var0 = (int)(57);
}
else{
 System.out.println("TP8 - TPInterface1Method4- LineInMethod: 4");
}
return (int)var5;

}

public int TP8method0(int var0, int var1, int var2, int var3, int var4){
 switch((var4-(int)(25))){
case 0:
var4 = (int)(52);
 break;
case 1:
var2 = (int)((var1+(int)(4))-(var2+var4));
 break;
case 2:
System.out.println("TP8 - TP8method0- LineInMethod: 7");
 break;
case 3:
TPInterface1Method2(var0,var4,var4,var0,var2,var2,var4,var0,var1); break;
case 4:
System.out.println("TP8 - TP8method0- LineInMethod: 14");
 break;
case 5:
System.out.println("TP8 - TP8method0- LineInMethod: 21");
 break;
default :
var4 = (int)((var1+var3)*(var4-var3));
}
return (int)var3;

}

public int TP8method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if(((var4*var3)>=(var4+var6))){
System.out.println("TP8 - TP8method1- LineInMethod: 4");
}
else{
 var6 = (int)((var6*var3)%(int)(42));
}
return (int)var3;

}

public int TP8method2(int var0, int var1, int var2, int var3, int var4){
 if( (((var1+var0)>=(var2*var3))&&((((var1/(int)(46))<=((var4/(int)(70))+(var3*var2)))&&((var1/(int)(8))<(var2/(int)(6))))||((var3*(int)(37))<=(var0-var1))))){
if( ((var3+var2)!=(var4*(int)(32)))){
if( ((var0+var1)<(var3/(int)(72)))){
var2 = (int)(((var0+(int)(24))-((var2%(int)(17))-(var2/(int)(30))))*(var3/(int)(49)));
}
}
}
return (int)var2;

}


public static void main(String args[]){
TP8 obj = new TP8();
obj.TPInterface1Method0((int)(41),(int)(43),(int)(72),(int)(20),(int)(14),(int)(12),(int)(4),(int)(49),(int)(3),(int)(60),(int)(62),(int)(52));
obj.TPInterface1Method1((int)(44),(int)(51),(int)(38),(int)(23),(int)(49));
obj.TPInterface1Method2((int)(22),(int)(19),(int)(73),(int)(45),(int)(44),(int)(31),(int)(4),(int)(18),(int)(36));
obj.TPInterface1Method3((int)(34),(int)(53),(int)(59),(int)(9),(int)(27),(int)(53),(int)(19));
obj.TPInterface1Method4((int)(67),(int)(56),(int)(70),(int)(16),(int)(70),(int)(29),(int)(28),(int)(71));
obj.TP8method0((int)(0),(int)(32),(int)(53),(int)(1),(int)(73));
obj.TP8method1((int)(6),(int)(47),(int)(32),(int)(39),(int)(33),(int)(58),(int)(72),(int)(65),(int)(30),(int)(0),(int)(75));
obj.TP8method2((int)(69),(int)(14),(int)(46),(int)(73),(int)(60));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP8 obj = new TP8();
obj.TPInterface1Method0(i0,i5,i2,i9,i11,i14,i3,i1,i10,i7,i8,i13);
obj.TPInterface1Method1(i1,i0,i2,i9,i12);
obj.TPInterface1Method2(i0,i1,i9,i2,i12,i7,i5,i6,i13);
obj.TPInterface1Method3(i8,i1,i7,i10,i6,i13,i4);
obj.TPInterface1Method4(i11,i9,i1,i12,i13,i6,i5,i14);
obj.TP8method0(i4,i3,i10,i12,i2);
obj.TP8method1(i4,i6,i5,i13,i8,i10,i3,i11,i0,i14,i2);
obj.TP8method2(i10,i6,i2,i3,i0);
}

}