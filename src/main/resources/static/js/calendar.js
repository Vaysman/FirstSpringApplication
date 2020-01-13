					class DayObject {
						// описываем свойства и методы объекта
						constructor(id) {
							this.id = id;
							this.checked = 0;
						}
						checkClick(id) {
							let modal = document.getElementById("myModal");
							let close = document.getElementsByClassName("close")[0];

							if(this.checked == 0) {
								this.checked = 1;
								$("#box-" + id).addClass("checked");
								modal.style.display = "block";
								$(".close").click(function() {
									modal.style.display = "none";
								});

								//$("body").append("<div class='tooltip' id='tooltip-" + this.id + "'>tooltip #" + this.id + "</div>");
							} else {
								this.checked = 0;
								$("#box-" + id).removeClass("checked");
							}
						}
						draw() {
							$('body .week').append("<div class='box' id='box-" + this.id + "'>" + this.id + "</div>");
						}
					}

					let date = new Date(); // формируем новый объект текущей даты

					let year = date.getFullYear(); // определяем текущий год
					let month = date.getMonth() + 1; // определяем текущий месяц
					let pMonth = date.getMonth(); // определяем предыдущий месяц
					/////
					/////
					/////
					start(date, month, pMonth, year); // запускаем функцию работы календаря

					$("#nextMonth").click(function() {
						// определяем следующий месяц
						month += 1;
						if(month > 12) {
							year += 1;
							month -= 12;
						}
						$(".box").remove();
						start(date, month, pMonth, year);
					});

					$("#prevMonth").click(function() {
						// определяем предыдущий месяц
						month -= 1;
						if(month < 1) {
							year -= 1;
							month += 12;
						}
						$(".box").remove();
						start(date, month, pMonth, year);
					});
					//////
					//////
					//////

					function start(date, month, pMonth, year) {
						let lastDay = new Date(year, month, 0).getDate();
						let lastPrevDay = new Date(year, month - 1, 0).getDay();
						let firstDay = new Date(year, month - 1, lastPrevDay).getDay();
						
						for (let j = 0; j < lastPrevDay; j++) {
								$('body .week').append("<div class='box'></div>");
						}
						
						for (let i = 1; i < lastDay + 1; i++) {
							let newBox = new DayObject(i);
							newBox.draw();
							$("#box-" + i).click(function(){
								newBox.checkClick(i);
							});
						}
						currentDate(month, year);
					}
					function currentDate(month, year) {
						//let nameDay = {'Воскресенье','Понедельник','Вторник','Среда','Четверг','Пятница','Суббота'};
						let nameMonth = ["январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"];
						$("#currentDate p").remove();
						$('#currentDate').append("<p>" + nameMonth[month-1] + " " + year + " года</p>");
					}