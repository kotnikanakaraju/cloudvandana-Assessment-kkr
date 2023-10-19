let operand1 = '';
let operand2 = '';
let operator = '';

function appendValue(value) {
    if (operator === '') {
        operand1 += value;
        document.getElementById('display').value = operand1;
    } else {
        operand2 += value;
        document.getElementById('display').value = operand2;
    }
}

function operate(op) {
    operator = op;
}

function calculate() {
    let result;
    switch (operator) {
        case '+':
            result = parseFloat(operand1) + parseFloat(operand2);
            break;
        case '-':
            result = parseFloat(operand1) - parseFloat(operand2);
            break;
        case '*':
            result = parseFloat(operand1) * parseFloat(operand2);
            break;
        case '/':
            result = parseFloat(operand1) / parseFloat(operand2);
            break;
    }
    document.getElementById('display').value = result;
}

function clearScreen() {
    document.getElementById('display').value = '';
    operand1 = '';
    operand2 = '';
    operator = '';
}
