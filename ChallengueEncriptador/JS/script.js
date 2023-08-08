const textArea = document.querySelector(".text-area");
const mensaje = document.querySelector(".mensaje");

//let matrizCodigo = [["e", "enter"], ["i","imes"], ["a","ai"],["o","ober"],["u","ufat"]];

//para verificar en consola del navegador
//console.table(matrizCodigo)

//Creación de la funcion del boton encriptar
function btnEncriptar(){
    const textoEncriptado = encriptar(textArea.value)
    mensaje.value = textoEncriptado
    textArea.value = "";
    mensaje.style.backgroundImage = "none"
}
//Creación de la funcion para encriptar
function encriptar(stringEncriptado){
    let matrizCodigo = [["e", "enter"], ["i","imes"], ["a","ai"],["o","ober"],["u","ufat"]];
    stringEncriptado = stringEncriptado.toLowerCase()

    //Ciclo for para verificar las letras a encriptar
    for(let i = 0; i < matrizCodigo.length; i++){
        if(stringEncriptado.includes(matrizCodigo[i][0])){
            stringEncriptado = stringEncriptado.replaceAll(matrizCodigo[i][0],matrizCodigo[i][1])
        }
    }

    return stringEncriptado

}