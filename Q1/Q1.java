class DogWalkCompany{

    public int walkDogs(int hour){
        int dogWalked = 0;
        if(maxDogs >= company.numAvaiableDogs(hour)){
            dogWalked = company.numAvaiableDogs(hour);
        }else{
            dogWalked = maxDogs;
        }
        return dogWalked;
    }
  //Question A

    public int dogWalkedShift(int startHour, int endHours){
        int dogWalked = 0;
        int money = 0;
        for(int i = startHour; i <= endHours; i++){
            int temp = walkDogs(i);
            dogWalked += temp;
            if((i>=9 && i <= 17)||(temp == maxDogs)){
                money += 3;
            }else{
                money += (dogWalked * 5);
            }
        }
        return money;
    }
  //Question B
}
