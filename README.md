# laborator1IP
Echipa: Bulbuc Razvan, Bujoreanu Cristian B2   
Structura programului: O clasa principala Zoo ce contine o lista de cladiri (clasa Building), fiecare instanta Building continand o lista de obiecte Animal.  
Animal e o clasa abstracta din care se mostenesc diferite animale - fiecare animal are atribute 2 string-uri "type" si "name".  
Clasa Building, la randul ei, are de asemenea un string "type", si la adaogarea unui animal intr-o cladire se verifica compatibilitatea intre cladire si animalul adaugat.  
Pentru cerinta de clasa abstracta si mostenire, este clasa abstracta Animal si clasele mostenite (Wolf, Tuna etc.)  
Pentru cerinta de polimorfism static, este metoda addBuilding() din clasa Zoo cu 2 signaturi - addBuilding(int) si addBuilding(String). Astfel, se poate adaoga o cladire in Zoo cu tipul ei fiind dat fie printr-un string, fie printr-un int ce codifica tipul(0 - "bird", 1 - "predatory", 2 - "fish")  
Pentru cerinta de polimorfism dinamic, este metoda wakeup() din clasa abstracta Animal si fiecare clasa mostenita; deci, cand apelam metoda wakeUpAnimals() dintr-o cladire(folosind ArrrayList-ul de obiecte Animal), se apeleaza varianta de wakeup() specifica fiecarui animal.
