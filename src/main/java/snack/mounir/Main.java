package snack.mounir;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import mouns.model.Article;
import mouns.model.Receipt;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Article> articles = new ArrayList<Article>();
		Receipt receipt = new Receipt();

		Integer orderChoice;
		Integer meatChoice;
		Integer simpleChoice;
		Integer addOrCheckChoice;

		// printCheck();
		do {

			String description;
			String descriptionOrder = null;
			String descriptionMeat = null;
			String descriptionSimpleOrMenu = null;

			Double priceArticle = 0.0;
			Integer quantity = 0;
			Double totalPriceQuantity = 0.0;

			/*
			 * ----------------------CHOIX DU TYPE DE SANDWICH------------------------------
			 */

			do {
				orderMenu();
				orderChoice = sc.nextInt();
				switch (orderChoice) {

				case 1:
					// Cheese Naan 5.00
					descriptionOrder = "Cheese Naan";
					priceArticle = 5.00;
					break;
				case 2:
					// 2. Durum 5.80
					descriptionOrder = "Durum";
					priceArticle = 5.80;
					break;
				case 3:
					// 3. Pita 4.80
					descriptionOrder = "Pita";
					priceArticle = 4.80;
					break;
				case 4:
					// 4. Assiette 7
					descriptionOrder = "Assiette";
					priceArticle = 7.00;
					break;
				default:
					break;
				}
			} while (orderChoice != 1 || orderChoice != 2 || orderChoice != 3 || orderChoice != 4);

			/* ----------------------CHOIX DE LA VIANDE------------------------------ */

			do {

				meatMenu();
				meatChoice = sc.nextInt();

				switch (meatChoice) {

				case 1:
//Kebab +0
					descriptionMeat = "Kebab";
					break;
				case 2:
//Chawarma poulet +1.80
					descriptionMeat = "Chawarma poulet";
					priceArticle = +1.8;
					break;
				case 3:
//Chawarma Boeuf +1.80
					descriptionMeat = "Chawarma boeuf";
					priceArticle = +1.8;
					break;
				case 4:
//Tenders +1.60
					descriptionMeat = "Tenders";
					priceArticle = +1.6;
					break;
				case 5:
//Kefta +1
					descriptionMeat = "Kefta";
					priceArticle = +1.00;
					break;
				case 6:
//Falafel +0
					descriptionMeat = "Falafel";
					break;

				default:
					break;
				}
			} while (meatChoice != 1 || meatChoice != 2 || meatChoice != 3 || meatChoice != 4 || meatChoice != 5
					|| meatChoice != 6);

			/* ----------------------CHOIX DU MENU------------------------------ */

			do {

				simpleOrMenu();
				simpleChoice = sc.nextInt();
				switch (simpleChoice) {

				case 1:
//sandwich seul +0
					descriptionSimpleOrMenu = "Simple";
					break;
				case 2:
//menu frite boisson + 1.50
					descriptionSimpleOrMenu = "Menu";
					priceArticle = +1.5;
					break;
				case 3:
//avec frites +0.6
					descriptionSimpleOrMenu = "+frites";
					priceArticle = +0.6;
					break;

				default:
					break;
				}
			} while (simpleChoice != 1 || simpleChoice != 2 || simpleChoice != 3);
			
			
			/* ------------------------- AJOUTER ARTICLE A LA COMMANDE -----------------------------*/
			
			String[] descriptions = { descriptionSimpleOrMenu, descriptionOrder, descriptionMeat };
			description = Arrays.asList(descriptions).toString();

			Article article = new Article();
			addSmtOrPrintCheck();
			addOrCheckChoice = sc.nextInt();

			switch (addOrCheckChoice) {

			case 1:
//Ajouter un autre article
				article.setDescription(description);
				article.setPrice(priceArticle);
				article.setQuantity(quantity);
				article.setTotalPriceQuantity(totalPriceQuantity);
				articles.add(article);
				break;
			case 2:
//Payer

				receipt.setArticles(articles);
				printCheck();
				break;

			default:
				break;
			}

		} while (addOrCheckChoice == 1);
	}

	public static void orderMenu() {
		System.out.println("Que souhaitez vous commander?");
		System.out.println("*****************************");
		System.out.println("*******1. Cheese Naan********");
		System.out.println("*********2. Durum************");
		System.out.println("***********3. Pita***********");
		System.out.println("**********4. Assiette**********");
		System.out.println("*****************************");
	}

	public static void meatMenu() {
		System.out.println("******Quelle viande? ********");
		System.out.println("*****************************");
		System.out.println("**********1. Kebab***********");
		System.out.println("****2. Chawarma Poulet*******");
		System.out.println("******3. Chawarma Boeuf******");
		System.out.println("*********4. Tenders**********");
		System.out.println("**********5. Kefta***********");
		System.out.println("**********6. Falafel*********");
		System.out.println("*****************************");
	}

	public static void simpleOrMenu() {
		System.out.println("****Avec frite & boisson?****");
		System.out.println("*****************************");
		System.out.println("****1. Sandwich Seulement****");
		System.out.println("**2. En Menu Boisson/frite***");
		System.out.println("******3. Avec les frites*****");
		System.out.println("*****************************");

	}

	public static void addSmtOrPrintCheck() {
		System.out.println("Autre chose/imprimer l'addition?");
		System.out.println("********************************");
		System.out.println("****1. Commander autre chose****");
		System.out.println("*************2. Payer***********");
		System.out.println("********************************");
	}

	public static void printCheck() {

		Date date = new Date();
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		Integer tva = 20;
		Double prixHT = 0.0;
		Double prixTTC = prixHT * tva / 100;
		List<Article> articles = new ArrayList<Article>();

		System.out.println("********* \t SNACK MOUNIR \t ********");
		System.out.println("******************************************************");
		System.out.println("\t\t 25 place des tenders \t\t");
		System.out.println("\t\t 59000 Lille \t\t");
		System.out.println("******************************************************");
		System.out.println("\t\t 03.40.98.97.62 \t\t");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("\t" + shortDateFormat.format(date));
		System.out.println(" \n ");
		System.out.println("Description \t Quantité \t Prix U \t Prix Total");
		System.out.println(articles);
		System.out.println("******************************************************");
		System.out.println("\t \t \t \t \t TVA = " + tva + "%");
		System.out.println("\t \t \t \t \t Prix TTC = " + prixTTC);
		System.out.println(" \n ");
		System.out.println(" \n ");

	}
}
