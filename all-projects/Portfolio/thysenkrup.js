function createCheckDigit(membershipId) {
    // Write the code that goes here.
    
  
    let sumID = combine(membershipId);
    while (parseInt(sumID) > 9) sumID = combine(sumID);
    return sumID;
  }
  
  function combine(stringID) {
    return stringID.toString().split('').reduce((a, b) => parseInt(a) + parseInt(b), 0);
  }
  

  let sumId = allNum(membershipId);
  while (parseInt(numSum) > 9) numSum = combine(numSum);
  return allNum;
}

function allNum(totalMembershipId) {
  return totalMembershipId.toString().split('').reduce((a, b) => parseInt(a) + parseInt(b), 0);
}
