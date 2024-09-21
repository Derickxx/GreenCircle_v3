function cadastra() {
	var n1 = document.getElementById("username").value;
	var n2 = document.getElementById("email").value;
	var n3 = document.getElementById("senha").value;
	var n4 = document.getElementById("rep_senha").value;

	if (n1 == "") {
		document.getElementById("username").focus();
		window.alert('entre com seu nome');
		document.getElementById("username").style.borderColor = "#ff0000"
		return false;
	}

	else {
		document.getElementById("username").style.borderColor = "#00ff00";
	}

	if (n2 == "") {
		document.getElementById("email").focus();
		window.alert('Preencha com seu email');
		document.getElementById("email").style.borderColor = "#ff0000"
		return false;
	}
	else if (n2.indexOf("@") == -1) {
		window.alert('Preencha com seu email');
		document.getElementById("email").focus();
		document.getElementById("email").style.borderColor = "#ff0000"
		return false;
	}
	else {
		document.getElementById("email").style.borderColor = "#00ff00";
	}

	if (n3 == "" || n4 <= 8 || n3 <= 8) {
		alert('digite sua senha');
		document.getElementById("senha").style.borderColor = "#ff0000"
		return false
	}
	else {
		document.getElementById("senha").style.borderColor = "#00ff00";
	}

	if (n3 != n4) {
		alert('digite a mesma senha');
		document.getElementById("rep_senha").style.borderColor = "#ff0000"
		return false
	}
	else {
		document.getElementById("rep_senha").style.borderColor = "#00ff00";
	}
}
function verificar() {
	var n1 = document.getElementById("username").value;
	var n2 = document.getElementById("password").value;


	if (n1 == "") {
		document.getElementById("username").focus();
		window.alert('Preencha com seu email');
		document.getElementById("username").style.borderColor = "#ff0000"
		return false;
	}
	else if (n1.indexOf("@") == -1) {
		window.alert('Preencha com seu email');
		document.getElementById("username").focus();
		document.getElementById("username").style.borderColor = "#ff0000"
		return false;
	}
	else {
		document.getElementById("username").style.borderColor = "#00ff00";
	}

	if (n2 == "") {
		document.getElementById("password").focus();
		window.alert('entre com sua senha');
		document.getElementById("password").style.borderColor = "#ff0000"
		return false;
	}
	else if (n2 == "" || n2.length <= 8) {
		document.getElementById("password").focus();
		window.alert('senha incorreta');
		document.getElementById("password").style.borderColor = "#ff0000"
		return false;
	}
	else {
		document.getElementById("password").style.borderColor = "#00ff00";
	}
	alert('seja bem-vindo')
}
function contato() {
	var n1 = document.getElementById("username").value;
	var n2 = document.getElementById("email").value;
	var n3 = document.getElementById("tel").value;
	var n4 = document.getElementById("date").value;
	var n5 = document.getElementById("mensage").value;


	if (n1 == "") {
		document.getElementById("username").focus();
		window.alert('entre com seu nome');
		document.getElementById("username").style.borderColor = "#ff0000"
		return false;
	}

	else {
		document.getElementById("username").style.borderColor = "#00ff00";

	}
	if (n2 == "") {
		document.getElementById("email").focus();
		window.alert('Preencha com seu email');
		document.getElementById("email").style.borderColor = "#ff0000"
		return false;
	}
	else if (n2.indexOf("@") == -1) {
		window.alert('Preencha com seu email');
		document.getElementById("email").focus();
		document.getElementById("email").style.borderColor = "#ff0000"
		return false;
	}
	else {
		document.getElementById("email").style.borderColor = "#00ff00";
	}
	if (n3 == "") {
		document.getElementById("tel").focus();
		window.alert('Preencha com seu numero');
		document.getElementById("tel").style.borderColor = "#ff0000"
		return false;
	}
	else if (isNaN(n3) || n3 <= 13 || n3.indexOf("+") == -1) {
		window.alert('numero incorreto');
		document.getElementById("tel").focus();
		document.getElementById("tel").style.borderColor = "#ff0000"
		return false;
	}
	else {
		document.getElementById("tel").style.borderColor = "#00ff00";
	}
	if (n4 == "") {
		document.getElementById("date").focus();
		window.alert('entre com sua data de nascimento');
		document.getElementById("date").style.borderColor = "#ff0000"
		return false;
	}

	else {
		document.getElementById("date").style.borderColor = "#00ff00";

	}

	if (n5 == "") {
		document.getElementById("mensage").focus();
		window.alert('digite uma mensagem');
		document.getElementById("mensage").style.borderColor = "#ff0000"
		return false;
	}

	else {
		document.getElementById("mensage").style.borderColor = "#00ff00";

	}
}

function consulta() {

	var n1 = document.getElementById("email");

	if (n1 == "") {
		document.getElementById("email").focus();
		window.alert('digite uma mensagem');
		document.getElementById("email").style.borderColor = "#ff0000"
		return false;
	}

	else {
		document.getElementById("email").style.borderColor = "#00ff00";

	}
}
function check() {

	console.log("Mensagem enviada");
}
function goBack() {
	window.history.back();
}
function showPopup() {
	document.getElementById('overlay').style.display = 'block';
}

function closePopup() {
	document.getElementById('overlay').style.display = 'none';
}

let currentIndex = 0;

function showSlide(index) {
	const slides = document.querySelector('.slides');
	const totalSlides = document.querySelectorAll('.slide').length;
	if (index >= totalSlides) {
		currentIndex = 0;
	} else if (index < 0) {
		currentIndex = totalSlides - 1;
	} else {
		currentIndex = index;
	}
	const offset = -currentIndex * 100;
	slides.style.transform = `translateX(${offset}%)`;
}

function moveSlide(step) {
	showSlide(currentIndex + step);
}

// Inicializa o carrossel na primeira imagem
showSlide(currentIndex);
// script.js

const slide = document.querySelector('.carousel-slide');
const totalImages = document.querySelectorAll('.carousel-slide img').length;
const imageWidth = 100 / totalImages; // 20% para 5 imagens

let cout = 0;
const slideInterval = 3000; // Intervalo de 3 segundos

function moveToNextImage() {
	cout++; // Incrementa o contador
	if (cout >= totalImages) {
		cout = 0; // Reseta o contador se atingir o final
	}
	const offset = -cout * imageWidth;
	slide.style.transform = `translateX(${offset}%)`;
}

setInterval(moveToNextImage, slideInterval); // Muda a imagem a cada 3 segundos

function filtro() {
	const products = {
		'produto1': 'produto1.html',
		'produto2': 'produto2.html',
		'produto3': 'produto3.html'
	};

	document.getElementById('search-button').addEventListener('click', () => {
		const query = document.getElementById('search').value.toLowerCase();
		const url = products[query];

		if (url) {
			window.location.href = url;
		} else {
			alert('Produto não encontrado.');
		}
	});
}

// Chama a função filtro para adicionar o event listener ao botão
filtro();

function navigateToPage() {
	// Altere a URL abaixo para o destino desejado
	window.location.href = "pagina_endereço.html";
}

function popup() {
	document.getElementById('finalizar-compra').addEventListener('click', function() {
		document.getElementById('popup').style.display = 'flex';
	});

	document.getElementById('ok-button').addEventListener('click', function() {
		window.location.href = "home.html"; // Substitua pelo caminho para a sua página inicial
	});
}

function toggleEditForm() {
	const form = document.getElementById('edit-profile-form');
	form.style.display = form.style.display === 'block' ? 'none' : 'block';
}

function toggleDeleteConfirmation() {
	const confirmDelete = document.getElementById('confirm-delete');
	confirmDelete.style.display = confirmDelete.style.display === 'block' ? 'none' : 'block';
}

function saveProfile() {
	const name = document.getElementById('edit-name').value;
	const email = document.getElementById('edit-email').value;
	const phone = document.getElementById('edit-phone').value;
	const address = document.getElementById('edit-address').value;
	const dob = document.getElementById('edit-dob').value;
	const gender = document.getElementById('edit-gender').value;

	document.getElementById('profile-name').textContent = name;
	document.getElementById('profile-email').textContent = `Email: ${email}`;
	document.getElementById('profile-phone').textContent = `Telefone: ${phone}`;
	document.getElementById('profile-address').textContent = address;
	document.getElementById('profile-dob').textContent = dob;
	document.getElementById('profile-gender').textContent = gender;

	toggleEditForm(); // Oculta o formulário após salvar
	alert('Perfil atualizado com sucesso!');
}

function deleteProfile() {
	if (confirm('Tem certeza de que deseja excluir seu perfil?')) {
		// Implementar a lógica de exclusão, como enviar uma solicitação para o servidor
		alert('Perfil excluído com sucesso!');
		// Redirecionar para a página inicial ou de login
		window.location.href = 'home.html';
	}
}

function previewImage(event) {
	const file = event.target.files[0];
	if (file) {
		const reader = new FileReader();
		reader.onload = function(e) {
			const preview = document.getElementById('preview-avatar');
			preview.src = e.target.result;
			preview.style.display = 'block';
			document.getElementById('profile-avatar').src = e.target.result;
		}
		reader.readAsDataURL(file);
	}
}