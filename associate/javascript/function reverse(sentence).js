function reverse(sentence) {
    const reversedSentence = sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
    return reversedSentence;
}


const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverse(inputSentence);
console.log("Reversed sentence:", reversedSentence);