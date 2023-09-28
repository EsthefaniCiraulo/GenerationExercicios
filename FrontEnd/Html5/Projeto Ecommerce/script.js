// Obtenha referências aos elementos HTML
const loginButton = document.getElementById("loginButton");
const lblNome = document.getElementById("lblNome");

// Adicione um evento de clique ao botão "Login"
loginButton.addEventListener("click", () => {
  const nomeUsuario = prompt("Insira Seu Nome!");
  lblNome.innerText = nomeUsuario;
  lblNome.classList.remove("invisivel");
  loginButton.classList.add("invisivel");
  alert("Bem Vindo, " + nomeUsuario + "!");
});

function salvar(e) {
    e.preventDefault();
    const form = document.getElementById("form");
  const txtNome = document.getElementById("txtNome");
  const txtEmail = document.getElementById("txtEmail");
  const txtTelefone = document.getElementById("txtTelefone");
  const txtMensagem = document.getElementById("txtMensagem");

  if ((txtNome.value == "")) {
    alert("Por Favor, Informe seu nome");
    return;
  }

  if ((txtEmail.value == "")) {
    alert("Por Favor, Informe seu e-mail");
    return;
  }

  if ((txtTelefone.value == "")) {
    alert("Por Favor, Informe seu telefone");
    return;
  }

  if ((txtMensagem.value == "")) {
    alert("Por Favor, Informe sua mensagem");
    return;
  }

  alert(
    `Mensagem enviada com sucesso! Em breve entraremos em contato pelo e-mail${txtEmail.value} ou pelo Telefone: ${txtTelefone.value}`
  );
  form.reset();
}
