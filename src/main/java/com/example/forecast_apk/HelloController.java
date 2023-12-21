package com.example.forecast_apk;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    String[ ] statelist = {"AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT"};
//    private String[ ] citylist(String state){
//        if (state == statelist[0]){
//
//            return statelist;
//        }
//        if (state == statelist[1]){
//
//            return statelist;
//        }
//        if (state == statelist[2]){
//
//            return statelist;
//        }
//        if (state == statelist[3]){
//
//            return statelist;
//        }
//        if (state == statelist[4]){
//
//            return statelist;
//        }
//        if (state == statelist[5]){
//
//            return statelist;
//        }
//        if (state == statelist[6]){
//
//            return statelist;
//        }
//        if (state == statelist[7]){
//
//            return statelist;
//        }
//        if (state == statelist[8]){
//
//            return statelist;
//        }
//        if (state == statelist[9]){
//
//            return statelist;
//        }
//        if (state == statelist[10]){
//
//            return statelist;
//        }
//        if (state == statelist[11]){
//
//            return statelist;
//        }
//        if (state == statelist[12]){
//
//            return statelist;
//        }
//
//        return statelist;
//    }
//
//    String[ ] AB;
//    String[ ] BC;
//    String[ ] MB;

    String[ ] ON ={"Addington Highlands","Adelaide-Metcalfe","Adjala-Tosorontio","Admaston/Bromley","Ajax","Alfred and Plantagenet","Algonquin Highlands","Alnwick/Haldimand","Alvinston","Amaranth","Amherstburg","Armour","Armstrong","Arnprior","Arran-Elderslie","Ashfield-Colborne-Wawanosh","Asphodel-Norwood","Assiginack","Athens","Atikokan","Augusta","Aurora","Aylmer","Bancroft","Barrie","Bayfield","Bayham","Beachburg","Beckwith","Belleville","Black River-Matheson","Blandford-Blenheim","Blind River","Bluewater","Bonfield","Bonnechere Valley","Bracebridge","Bradford West Gwillimbury","Brampton","Brant","Brantford","Breslau","Brighton","Brock","Brockton","Brockville","Brudenell, Lyndoch and Raglan","Burford","Burlington","Caledon","Callander","Cambridge","Carleton Place","Carling","Casselman","Cavan Monaghan","Central Elgin","Central Frontenac","Central Huron","Central Manitoulin","Centre Hastings","Centre Wellington","Champlain","Chapleau","Chatham","Chatsworth","Chisholm","Claremont","Clarence-Rockland","Clarington","Clearview","Cobalt","Cobourg","Cochrane","Collingwood","Conestogo","Cornwall","Cramahe","Dawn-Euphemia","Deep River","Deseronto","Douro-Dummer","Drummond/North Elmsley","Dryden","Dutton/Dunwich","Dysart et al","East Ferris","East Garafraxa","East Gwillimbury","East Hawkesbury","East Zorra-Tavistock","Edwardsburgh/Cardinal","Elizabethtown-Kitley","Elliot Lake","Emo","Englehart","Enniskillen","Erin","Espanola","Essa","Essex","Faraday","Fort Erie","Fort Frances","French River / Rivière des Français","Front of Yonge","Frontenac Islands","Gananoque","Georgian Bay","Georgian Bluffs","Georgina","Goderich","Grand Valley","Gravenhurst","Greater Madawaska","Greater Napanee","Greenstone","Grey Highlands","Grimsby","Guelph","Guelph/Eramosa","Halton Hills","Hamilton","Hamilton Township","Hanover","Hastings Highlands","Havelock-Belmont-Methuen","Hawkesbury","Hearst","Hensall","Highlands East","Hillsburgh","Hindon Hill","Horton","Howick","Huntsville","Huron East","Huron Shores","Huron-Kinloss","Ignace","Ingersoll","Innisfil","Iroquois Falls","Kapuskasing","Kawartha Lakes","Kenora","Killaloe, Hagarty and Richards","Kincardine","King","Kingsville","Kirkland Lake","Kitchener","Komoka","Laird","Lake of Bays","Lakeshore","Lambton Shores","Lanark Highlands","Lappe","LaSalle","Laurentian Hills","Laurentian Valley","Leamington","Leeds and the Thousand Islands","Lincoln","London","Loyalist","Lucan Biddulph","Macdonald, Meredith and Aberdeen Additional","Madawaska Valley","Madoc","Magnetawan","Malahide","Manitouwadge","Mapleton","Marathon","Markham","Markstay","Marmora and Lake","Mattawa","McDougall","McKellar","McNab/Braeside","Meaford","Melancthon","Merrickville","Middlesex Centre","Midland","Milton","Minto","Mississauga","Mississippi Mills","Mono","Montague","Moonbeam","Moosonee","Morris-Turnberry","Mulmur","Muskoka Falls","Neebing","New Tecumseth","Newmarket","Niagara Falls","Niagara-on-the-Lake","Nipigon","Nipissing","North Algona Wilberforce","North Bay","North Dumfries","North Dundas","North Frontenac","North Glengarry","North Grenville","North Huron","North Kawartha","North Middlesex","North Perth","North Stormont","Northeastern Manitoulin and the Islands","Northern Bruce Peninsula","Norwich","Oakville","Oliver Paipoonge","Orangeville","Orillia","Oro-Medonte","Oshawa","Otonabee-South Monaghan","Ottawa","Owen Sound","Papineau-Cameron","Parry Sound","Pelham","Pembroke","Penetanguishene","Perry","Perth","Perth East","Perth South","Petawawa","Peterborough","Petrolia","Pickering","Plantagenet","Plympton-Wyoming","Point Edward","Port Colborne","Port Hope","Powassan","Prescott","Prince","Puslinch","Quinte West","Ramara","Red Lake","Renfrew","Richmond Hill","Rideau Lakes","Russell","Sables-Spanish Rivers","Sagamok","Sarnia","Saugeen Shores","Sault Ste. Marie","Schreiber","Scugog","Seguin","Selwyn","Severn","Shelburne","Shuniah","Sioux Lookout","Sioux Narrows-Nestor Falls","Smiths Falls","Smooth Rock Falls","South Algonquin","South Bruce","South Bruce Peninsula","South Dundas","South Frontenac","South Glengarry","South Huron","South River","South Stormont","Southgate","Southwest Middlesex","South-West Oxford","Southwold","Springwater","St. Catharines","St. Clair","St. Joseph","St. Marys","St. Thomas","St.-Charles","Stirling-Rawdon","Stone Mills","Stouffville","Stratford","Strathroy-Caradoc","Strong","Sudbury","Tara","Tay","Tay Valley","Tecumseh","Temiskaming Shores","Terrace Bay","Thames Centre","The Blue Mountains","The Nation / La Nation","Thessalon","Thorold","Thunder Bay","Tillsonburg","Timmins","Tiny","Toronto","Trent Hills","Trent Lakes","Tweed","Tyendinaga","Uxbridge","Vaughan","Wainfleet","Warwick","Wasaga Beach","Waterloo","Wawa","Welland","Wellesley","Wellington","Wellington North","West Elgin","West Grey","West Lincoln","West Nipissing / Nipissing Ouest","West Perth","Whitby","Whitewater Region","Wilmot","Windsor","Woodstock","Woolwich","Zorra"};
//    String[ ] PE;
//    String[ ] QC;
//    String[ ] SK;
//    String[ ] YT;


    API a;
    get_coordinate latlon = new get_coordinate();
    private double X;
    private double Y;
    @FXML
    private TextField search;

    @FXML
    private Label Current_date_time;
    @FXML
    private Label precipitation;

    @FXML
    private Label humidity;
    @FXML
    private Label time;
    @FXML
    private Label a1;
    @FXML
    private Label a2;
    @FXML
    private Label a3;
    @FXML
    private Label a4;
    @FXML
    private Label a5;
    @FXML
    private Label a6;
    @FXML
    private Label a7;
    @FXML
    private Label a8;
    @FXML
    private Label c1;
    @FXML
    private Label c2;
    @FXML
    private Label c3;
    @FXML
    private Label c4;
    @FXML
    private Label c5;
    @FXML
    private Label c6;
    @FXML
    private Label c7;
    @FXML
    private Label c8;
    @FXML
    private ChoiceBox <String> location_state;
    @FXML
    private ChoiceBox <String> location_city;
    @FXML
    void details(){
try {
    Parent root = FXMLLoader.load(getClass().getResource("detailed_view.fxml"));
    Stage newStage = new Stage();
    newStage.setTitle("Detailed View");
    newStage.setScene(new Scene(root));
    newStage.show();
}
catch (IOException e){
    System.out.println(e);
}
    }
    @FXML
    void magic() {
        String state = location_state.getValue();
        String city = location_city.getValue();
        //    private final String[ ] list = {"Toronto","Montréal, QC","Vancouver, BC","Calgary, AB","Edmonton, AB","Ottawa","Winnipeg, MB","Quebec City, QC","Hamilton","Mississauga","Brampton, ON","Surrey, BC","Kitchener, ON","Halifax, NS","Laval, QC","London, ON","Victoria, BC","Markham, ON","Oshawa, ON","Vaughan, ON","Windsor, ON","Gatineau, QC","Saskatoon, SK","Longueuil, QC","Burnaby, BC","St. Catharines, ON","Regina, SK","Oakville, ON","Richmond, BC","Richmond Hill, ON","Burlington, ON","St. John's, NL","Kelowna, BC","Sherbrooke, QC","Sudbury, ON","Barrie, ON","Abbotsford, BC","Lévis, QC","Coquitlam, BC","Saguenay, QC","Guelph, ON","Trois-Rivières, QC","Whitby, ON","Cambridge, ON","Milton, ON","Ajax, ON","Waterloo, ON","Terrebonne, QC","Moncton, NB","Saanich, BC","White Rock, BC","Thunder Bay, ON","Delta, BC","Nanaimo, BC","Brantford, ON","Chatham, ON","Clarington, ON","Saint-Jérôme, QC","Red Deer, AB","Pickering, ON","Lethbridge, AB","Kamloops, BC","Saint-Jean-sur-Richelieu, QC","Niagara Falls, ON","Cape Breton, NS","Chilliwack, BC","Brossard, QC","Maple Ridge, BC","Newmarket, ON","Repentigny, QC","Peterborough, ON","Drummondville, QC","Kawartha Lakes, ON","New Westminster, BC","Prince George, BC","Caledon, ON","Châteauguay, QC","Belleville, ON","Airdrie, AB","Sarnia, ON","Wood Buffalo, AB","Sault Ste. Marie, ON","Saint John, NB","Welland, ON","Granby, QC","St. Albert, AB","Fredericton, NB","Grande Prairie, AB","Medicine Hat, AB","Halton Hills, ON","Aurora, ON","Port Coquitlam, BC","Mirabel, QC","Blainville, QC","Lac-Brome, QC","North Vancouver, BC","Saint-Hyacinthe, QC","Beloeil, QC","North Bay, ON", "Charlottetown, PE","Vernon, BC","Brandon, MB","Mascouche, QC","Stouffville, ON","Shawinigan, QC","Joliette, QC","Rimouski, QC","Courtenay, BC","Dollard-des-Ormeaux, QC","Cornwall, ON","Victoriaville, QC","Georgina, ON","Woodstock, ON","Langford Station, BC","Quinte West, ON","St. Thomas, ON","Saint-Eustache, QC","West Vancouver, BC","New Tecumseth, ON","Innisfil, ON","Vaudreuil-Dorion, QC","Bradford West Gwillimbury, ON","Salaberry-de-Valleyfield, QC","Rouyn-Noranda, QC","Boucherville, QC","Mission, BC","Timmins, ON","Lakeshore, ON","Brant, ON","Spruce Grove, AB","Campbell River, BC","Prince Albert, SK","Penticton, BC","Sorel-Tracy, QC","East Kelowna, BC","Leamington, ON","East Gwillimbury, ON","Côte-Saint-Luc, QC","Orangeville, ON","Leduc, AB","Moose Jaw, SK","Port Moody, BC","Pointe-Claire, QC","Orillia, ON","Stratford, ON","Fort Erie, ON","Val-d’Or, QC","LaSalle, ON","Cochrane, AB","North Cowichan, BC","Lloydminster, SK","Chambly, QC","Centre Wellington, ON","Okotoks, AB","Alma, QC","Sainte-Julie, QC","Saint-Constant, QC","Langley, BC","Grimsby, ON","Magog, QC","Boisbriand, QC","Whitehorse, YT","Dieppe, NB","King, ON","Parksville, BC","Conception Bay South, NL","Fort Saskatchewan, AB","Woolwich, ON","Sainte-Thérèse, QC","Clarence-Rockland, ON","La Prairie, QC","Saint-Bruno-de-Montarville, QC","Midland, ON","Thetford Mines, QC","Lincoln, ON","Quispamsis, NB","Wasaga Beach, ON","Collingwood, ON","Sept-Îles, QC","Duncan, BC","Hudson, QC","Saint-Lin--Laurentides, QC","Strathroy-Caradoc, ON","Squamish, BC","Thorold, ON","Truro, NS","Amherstburg, ON","L’Assomption, QC","Tecumseh, ON","Candiac, QC","Essa, ON","Paradise, NL","Saint-Lambert, QC","Mount Pearl Park, NL","Saint-Lazare, QC","Owen Sound, ON","Brockville, ON","Chestermere, AB","Kingsville, ON", "Port Alberni, BC","Springwater, ON","Scugog, ON","Uxbridge, ON","Fort St. John, BC","Wilmot, ON","Essex, ON","Varennes, QC","Oro-Medonte, ON","Mont-Royal, QC","Beaumont, AB","Baie-Comeau, QC","Riverview, NB","Cobourg, ON","Cranbrook, BC","Yellowknife, NT","South Frontenac, ON","Rivière-du-Loup, QC","Port Colborne, ON","Saint-Augustin-de-Desmaures, QC","Huntsville, ON","Sainte-Marthe-sur-le-Lac, QC","Lloydminster, AB","Westmount, QC","Russell, ON","Les Coteaux, QC","Salmon Arm, BC","Kirkland, QC","Corner Brook, NL","New Glasgow, NS","Dorval, QC","Beaconsfield, QC","Pitt Meadows, BC","Niagara-on-the-Lake, ON","Colwood, BC","Middlesex Centre, ON","Mont-Saint-Hilaire, QC","Camrose, AB","Selwyn, ON","Tillsonburg, ON","Pelham, ON","Petawawa, ON","Stony Plain, AB","Oak Bay, BC","North Grenville, ON","Loyalist, ON","Deux-Montagnes, QC","Steinbach, MB","Saint-Colomban, QC","Miramichi, NB","Esquimalt, BC","Central Saanich, BC","Sainte-Catherine, QC","Port Hope, ON","Inverness, NS","Saint-Basile-le-Grand, QC","L’Ancienne-Lorette, QC","Swift Current, SK","Pembroke, ON","Edmundston, NB","Yorkton, SK","Springfield, MB","Sylvan Lake, AB","Bracebridge, ON","Summerside, PE","Canmore, AB","Bathurst, NB","Greater Napanee, ON","Lake Country, BC","Hanover, MB","Winkler, MB","Saint-Charles-Borromée, QC","Cowansville, QC","Sainte-Anne-des-Plaines, QC","Gaspé, QC","Sooke, BC","Kenora, ON","Cold Lake, AB","Brooks, AB","Kentville, NS","Comox, BC","Pincourt, QC","Mississippi Mills, ON","St. Clair, ON","Terrace, BC","Mercier, QC","West Lincoln, ON","Lavaltrie, QC","West Nipissing / Nipissing Ouest, ON","Strathmore, AB","High River, AB","Clearview, ON","Lachute, QC","Rosemère, QC","Matane, QC","Thames Centre, ON","Powell River, BC","Carleton Place, ON","Guelph/Eramosa, ON","Grand Falls, NL", "North Battleford, SK","Mont-Laurier, QC","Central Elgin, ON","Mistassini, QC","Saugeen Shores, ON","Ingersoll, ON","Beauharnois, QC","South Stormont, ON","Bécancour, QC","Severn, ON","Lacombe, AB","Sainte-Sophie, QC","Val-des-Monts, QC","Saint-Amable, QC","Portage La Prairie, MB","South Glengarry, ON","Sainte-Marie, QC","North Perth, ON","Thompson, MB","Trent Hills, ON","Trail, BC","The Nation / La Nation, ON","Amos, QC","Wetaskiwin, AB","West Grey, ON","Warman, SK","Dawson Creek, BC","Sidney, BC","Gravenhurst, ON","Prince Rupert, BC","Perth East, ON","North Saanich, BC","Prévost, QC","Sainte-Adèle, QC","Sainte-Agathe-des-Monts, QC","Quesnel, BC","Les Îles-de-la-Madeleine, QC","Taché, MB","Wellington North, ON","St. Andrews, MB","Williams Lake, BC","Gander, NL","Whistler, BC","Brighton, ON","Tiny, ON","Hawkesbury, ON","Carignan, QC","Brock, ON","L’Île-Perrot, QC","Summerland, BC","St. Clements, MB","View Royal, BC","Montmagny, QC","Cantley, QC","Erin, ON","Notre-Dame-de-l'Île-Perrot, QC","Kincardine, ON","Elliot Lake, ON","Bromont, QC","Arnprior, ON","North Dundas, ON","Wellesley, ON","Nelson, BC","Ladysmith, BC","Coldstream, BC","Georgian Bluffs, ON","Weyburn, SK","La Tuque, QC","Norwich, ON","Meaford, ON","Adjala-Tosorontio, ON","Hamilton Township, ON","Stratford, PE","Estevan, SK","South Dundas, ON","Lambton Shores, ON","North Dumfries, ON","Martensville, SK","Mapleton, ON","Rawdon, QC","Morinville, AB","Blackfalds, AB","Chester, NS","Queens, NS","Selkirk, MB","Saint-Félicien, QC","Roberval, QC","Rideau Lakes, ON","Sechelt, BC","Bois-des-Filion, QC","North Glengarry, ON","South Huron, ON","Marieville, QC","Penetanguishene, ON","Tay, ON","Castlegar, BC","Cavan Monaghan, ON","Morden, MB","Temiskaming Shores, ON","Hinton, AB", "Saint-Sauveur, QC","Grey Highlands, ON","East St. Paul, MB","Stoneham-et-Tewkesbury, QC","Alfred and Plantagenet, ON","Mont-Tremblant, QC","Saint-Zotique, QC","Saint-Raymond, QC","Gibsons, BC","Amherst, NS","Elizabethtown-Kitley, ON","Smiths Falls, ON","Lorraine, QC","Ramara, ON","Notre-Dame-des-Prairies, QC","Leeds and the Thousand Islands, ON","Brockton, ON","Laurentian Valley, ON","Mono, ON","Sainte-Julienne, QC","Qualicum Beach, BC","Malahide, ON","Oromocto, NB","Whitecourt, AB","Olds, AB","Huron East, ON","Beckwith, ON","Labrador City, NL","Shelburne, ON","Stanley, MB","Taber, AB","Donnacona, QC","Corman Park No. 344, SK","L’Epiphanie, QC","West Perth, ON","Campbellton, NB","Bridgewater, NS","Coaldale, AB","Pont-Rouge, QC","Champlain, ON","Coaticook, QC","Minto, ON","La Pêche, QC","Shediac, NB","Otterburn Park, QC","Sainte-Brigitte-de-Laval, QC","Sainte-Catherine-de-la-Jacques-Cartier, QC","South Bruce Peninsula, ON","Portugal Cove-St. Philip's, NL","Edson, AB","Renfrew, ON","Farnham, QC","Delson, QC","Plympton-Wyoming, ON","Banff, AB","Kapuskasing, ON","La Malbaie, QC","Boischatel, QC","Beauport, QC","Zorra, ON","Kitimat, BC","Macdonald, MB","Happy Valley, NL","Saint-Hippolyte, QC","Dauphin, MB","Church Point, NS","Old Chelsea, QC","Drumheller, AB","Kirkland Lake, ON","Aylmer, ON","Saint-Apollinaire, QC","Puslinch, ON","Argyle, NS","Torbay, NL","Yarmouth, NS","Innisfail, AB","Nicolet, QC","Rockwood, MB","Drummond/North Elmsley, ON","Contrecoeur, QC","Hanover, ON","Dryden, ON","Iqaluit, NU","Fort Frances, ON","Goderich, ON","La Sarre, QC","Chandler, QC","Stone Mills, ON","South-West Oxford, ON","Acton Vale, QC","Douro-Dummer, ON","Saint-Philippe, QC","McNab/Braeside, ON","Central Huron, ON","Rigaud, QC","Louiseville, QC","Chibougamau, QC","Coteau-du-Lac, QC","Ritchot, MB","Kimberley, BC", "Blandford-Blenheim, ON","Bayham, ON","Augusta, ON","Stephenville, NL","The Pas, MB","St. Marys, ON","Saint-Rémi, QC","Drayton Valley, AB","Ponoka, AB","Southgate, ON","Les Cèdres, QC","Baie-Saint-Paul, QC","Merritt, BC","Bluewater, ON","East Zorra-Tavistock, ON","Brownsburg, QC","Asbestos, QC","Otonabee-South Monaghan, ON","Huron-Kinloss, ON","Hampstead, QC","Saint-Joseph-du-Lac, QC","Plessisville, QC","The Blue Mountains, ON","Whitewater Region, ON","Edwardsburgh/Cardinal, ON","Sainte-Anne-des-Monts, QC","Bay Roberts, NL","Wainfleet, ON","North Stormont, ON","Alnwick/Haldimand, ON","Peace River, AB","Saint-Lambert-de-Lauzon, QC","Arran-Elderslie, ON","Parry Sound, ON","Val-Shefford, QC","West St. Paul, MB","Slave Lake, AB","Port-Cartier, QC","Barrington, NS","Rocky Mountain House, AB","Muskoka Falls, ON","Cornwall, PE","Saint-Paul, QC","Devon, AB","Perth, ON","Wainwright, AB","Shannon, QC","Saint-Honoré, QC","Beaubassin East / Beaubassin-est, NB","Bonnyville, AB","Cramahe, ON","Beauceville, QC","North Middlesex, ON","Beaupré, QC","Charlemagne, QC","Kent, BC","Clarenville, NL","Mont-Joli, QC","Pointe-Calumet, QC","Dysart et al, ON","Carbonear, NL","Hope, BC","Pontiac, QC","L'Ange-Gardien, QC","Hindon Hill, ON","La Broquerie, MB","Tweed, ON","Oliver Paipoonge, ON","Saint-Félix-de-Valois, QC","Melfort, SK","Stettler, AB","Niverville, MB","McMasterville, QC","Douglas, NB","Saint-Calixte, QC","Lac-Mégantic, QC","Humboldt, SK","St. Paul, AB","Saint-Henri, QC","Peachland, BC","Verchères, QC","Richelieu, QC","Petrolia, ON","Southwest Middlesex, ON","Front of Yonge, ON","Oliver, BC","Vegreville, AB","Princeville, QC","Saint-Césaire, QC","Tay Valley, ON","South Bruce, ON","Antigonish, NS","Crowsnest Pass, AB","Redcliff, AB","Val-David, QC","Fernie, BC","Windsor, NS","Notre-Dame-du-Mont-Carmel, QC","Sainte-Martine, QC","Creston, BC", "Saint-Roch-de-l'Achigan, QC","Sussex, NB","Saint-Pie, QC","Ashfield-Colborne-Wawanosh, ON","Trent Lakes, ON","Northern Rockies, BC","Gananoque, ON","Windsor, QC","Smithers, BC","Tracadie, NB","Meadow Lake, SK","Lanark Highlands, ON","Sackville, NB","Grand Falls, NB","Armstrong, BC","Cochrane, ON","La Ronge, SK","Marystown, NL","Sioux Lookout, ON","Didsbury, AB","Deer Lake, NL","Woodstock, NB","Flin Flon, SK","Brokenhead, MB","Burton, NB","Montréal-Ouest, QC","Spallumcheen, BC","Westlock, AB","Témiscouata-sur-le-Lac, QC","Osoyoos, BC","Saint Marys, NB","Hearst, ON","Metchosin, BC","Wolfville, NS","Breslau, ON","Stonewall, MB","Memramcook, NB","Sainte-Anne-de-Bellevue, QC","Stirling-Rawdon, ON","Mont-Orford, QC","Ste. Anne, MB","Espanola, ON","West Elgin, ON","Flin Flon (Part), MB","Grand Bay-Westfield, NB","East Ferris, ON","Neepawa, MB","North Huron, ON","Saint-Germain-de-Grantham, QC","Saint-Cyrille-de-Wendover, QC","Chisasibi, QC","Southwold, ON","Chertsey, QC","Shippagan, NB","Lanoraie, QC","Centre Hastings, ON","Coverdale, NB","Warwick, QC","Hanwell, NB","Napierville, QC","Waterloo, QC","Saint-Joseph-de-Beauce, QC","White City, SK","Lucan Biddulph, ON","Berthierville, QC","Rivière-Rouge, QC","Greenstone, ON","Kindersley, SK","Saint-Denis-de-Brompton, QC","Jasper, AB","Barrhead, AB","Melville, SK","Amqui, QC","Saint-Mathias-sur-Richelieu, QC","Tyendinaga, ON","Iroquois Falls, ON","Havelock-Belmont-Methuen, ON","Cornwallis, MB","Saint-Boniface, QC","Westbank, BC","Edenwold No. 158, SK","Cumberland, BC","Goulds, NL","Vanderhoof, BC","Château-Richer, QC","Saint Stephen, NB","Nipawin, SK","Battleford, SK","Hampton, NB","Montréal-Est, QC","Central Frontenac, ON","Saint-Antonin, QC","Saint-Jean-de-Matha, QC","Headingley, MB","Seguin, ON","Beresford, NB","La Pocatière, QC","Bowen Island, BC","Caraquet, NB","Altona, MB", "Roxton Pond, QC","Saint-Étienne-des-Grès, QC","Grand Forks, BC","New Maryland, NB","Port Hardy, BC","Saint-Donat, QC","Madawaska Valley, ON","Deep River, ON","Asphodel-Norwood, ON","Red Lake, ON","Métabetchouan-Lac-à-la-Croix, QC","Maniwaki, QC","Vermilion, AB","Hastings Highlands, ON","Prescott, ON","Carstairs, AB","Danville, QC","Channel-Port aux Basques, NL","Lac-Etchemin, QC","Saint-Jacques, QC","Swan River, MB","Stellarton, NS","Northern Bruce Peninsula, ON","L’Islet-sur-Mer, QC","Carleton-sur-Mer, QC","Sparwood, BC","Casselman, ON","Oka, QC","Callander, ON","Amaranth, ON","Marmora and Lake, ON","Raymond, AB","Morin-Heights, QC","Dundas, NB","Simonds, NB","Crabtree, QC","Bancroft, ON","Saint-Tite, QC","Howick, ON","Dutton/Dunwich, ON","New Richmond, QC","Perth South, ON","Claresholm, AB","Baie-d’Urfé, QC","Montague, ON","Saint-André-Avellin, QC","Saint-Ambroise-de-Kildare, QC","East Angus, QC","Rossland, BC","Mackenzie, BC","Golden, BC","Saint-Adolphe-d'Howard, QC","Warwick, ON","Bonnechere Valley, ON","Pincher Creek, AB","Alnwick, NB","Saint-Prosper, QC","Crossfield, AB","Ormstown, QC","Cardston, AB","De Salaberry, MB","Grande Cache, AB","Saint-Agapit, QC","Fruitvale, BC","Saint-Ambroise, QC","Westville, NS","Hay River, NT","Pasadena, NL","Mistissini, QC","Studholm, NB","Lorette, MB","Saint-Faustin--Lac-Carré, QC","Morris-Turnberry, ON","Placentia, NL","Saint-Pascal, QC","Mulmur, ON","Blind River, ON","Dunham, QC","High Level, AB","Havre-Saint-Pierre, QC","Saint-Anselme, QC","Trois-Pistoles, QC","Grande-Rivière, QC","Malartic, QC","Bonavista, NL","Prince Albert No. 461, SK","Saint-Maurice, QC","Killarney - Turtle Mountain, MB","Woodlands, MB","Lewisporte, NL","Invermere, BC","Bifrost-Riverton, MB","Ascot Corner, QC","Cartier, MB","Fossambault-sur-le-Lac, QC","Sainte-Anne-des-Lacs, QC","Saint-Sulpice, QC","Penhold, AB","Powassan, ON","Highlands East, ON", "Saint-Alphonse-de-Granby, QC","Sainte-Claire, QC","Bright, NB","Ellison, BC","Percé, QC","Saint-Jean-Port-Joli, QC","East Hawkesbury, ON","Buckland No. 491, SK","Saint-André-d'Argenteuil, QC","Saint-Côme--Linière, QC","Marathon, ON","Forestville, QC","Compton, QC","Shuniah, ON","Inuvik, NT","Richmond, QC","Lake Cowichan, BC","Saint-Gabriel-de-Valcartier, QC","Gibbons, AB","Sables-Spanish Rivers, ON","Hillsburg-Roblin-Shell River, MB","Port Hawkesbury, NS","Three Hills, AB","Kingston, NB","Paspebiac, QC","Saint-Thomas, QC","Saint-Jean-Baptiste, QC","Portneuf, QC","Pictou, NS","Tisdale, SK","Lake of Bays, ON","Bishops Falls, NL","WestLake-Gladstone, MB","Normandin, QC","Mitchell, MB","Saint-Alphonse-Rodriguez, QC","Beauséjour, MB","Dalhousie, NB","Val-Morin, QC","Lac du Bonnet, MB","Clermont, QC","Virden, MB","Saint-Christophe-d'Arthabaska, QC","Mont-Saint-Grégoire, QC","Thurso, QC","Wellington, NB","Cedar, BC","Saint-Gabriel, QC","Merrickville, ON","Saint-Liboire, QC","Dégelis, QC","Morris, MB","Saint-Alexis-des-Monts, QC","Cap-Saint-Ignace, QC","Fort Macleod, AB","Enderby, BC","Carman, MB","Saint-Anaclet-de-Lessard, QC","Stoke, QC","Adelaide-Metcalfe, ON","Melancthon, ON","Cap Santé, QC","Saint-David-de-Falardeau, QC","Harbour Grace, NL","Houston, BC","Springdale, NL","Pemberton, BC","Athabasca, AB","Saint-Ferréol-les-Neiges, QC","Laurentian Hills, ON","Grand Valley, ON","Senneterre, QC","Saint-Mathieu-de-Beloeil, QC","Sainte-Marie-Madeleine, QC","Admaston/Bromley, ON","North Algona Wilberforce, ON","Errington, BC","Wawa, ON","Sainte-Mélanie, QC","Horton, ON","Saint-Paul-d'Abbotsford, QC","Saint-Michel, QC","Botwood, NL","Coalhurst, AB","Saint-Marc-des-Carrières, QC","Stanstead, QC","Sainte-Anne-de-Beaupré, QC","Sainte-Luce, QC","Saint-Joseph-de-Sorel, QC","Rankin Inlet, NU","Kingsclear, NB","Princeton, BC","La Loche, SK","Ferme-Neuve, QC","Yamachiche, QC","Adstock, QC","Cowichan Bay, BC","Vanscoy No. 345, SK","Enniskillen, ON","Royston, BC", "Bonaventure, QC","Pohénégamook, QC","Saint-Isidore, QC","Wakefield, NB","Arviat, NU","Sainte-Marguerite-du-Lac-Masson, QC","Saint-Prime, QC","Kuujjuaq, QC","Atikokan, ON","Grenville-sur-la-Rouge, QC","North Cypress-Langford, MB","Saint-Dominique, QC","Macamic, QC","Sainte-Anne-de-Sorel, QC","Sundre, AB","Rougemont, QC","Piedmont, QC","Grimshaw, AB","Lac-des-Écorces, QC","Markstay, ON","Northeastern Manitoulin and the Islands, ON","Pelican Narrows, SK","McDougall, ON","Black Diamond, AB","Saint-Pamphile, QC","Bedford, QC","Weedon-Centre, QC","Lacolle, QC","Saint-Gabriel-de-Brandon, QC","Huntingdon, QC","French River / Rivière des Français, ON","Spaniards Bay, NL","Cocagne, NB","Pilot Butte, SK","Saint-Bruno, QC","Laurier-Station, QC","Saint-Anicet, QC","Cap-Chat, QC","Sexsmith, AB","Notre-Dame-de-Lourdes, QC","Ville-Marie, QC","Wickham, QC","Shippegan, NB","East Garafraxa, ON","Unity, SK","Rimbey, AB","High Prairie, AB","Turner Valley, AB","Hanna, AB","Neuville, QC","Fort Smith, NT","Maria, QC","Saint-Chrysostome, QC","Greater Madawaska, ON","Berwick, NS","Saint-Damase, QC","Disraeli, QC","Meadow Lake No. 588, SK","Elkford, BC","Georgian Bay, ON","Saint-Alexandre, QC","Hérbertville, QC","Moosomin, SK","Highlands, BC","North Kawartha, ON","Sainte-Thècle, QC","Fermont, QC","Esterhazy, SK","Holyrood, NL","La Présentation, QC","Beaverlodge, AB","Sainte-Catherine-de-Hatley, QC","Saint-Basile, QC","Saint-Raphaël, QC","Saint-Martin, QC","Causapscal, QC","Brigham, QC","Sainte-Victoire-de-Sorel, QC","Perry, ON","Port-Daniel--Gascons, QC","Rosetown, SK","Minnedosa, MB","Labelle, QC","Lincoln, NB","Black River-Matheson, ON","Saint-Michel-des-Saints, QC","Dufferin, MB","Saint-Victor, QC","Sicamous, BC","Cap Pele, NB","Kelsey, MB","Killaloe, Hagarty and Richards, ON","Alvinston, ON","Trenton, NS","Lunenburg, NS","Saint-Éphrem-de-Beauce, QC","Chase, BC","Léry, QC","Assiniboia, SK","Tumbler Ridge, BC", "Salisbury, NB","Témiscaming, QC","Magrath, AB","Sainte-Geneviève-de-Berthier, QC","Logy Bay-Middle Cove-Outer Cove, NL","Buctouche, NB","Grand Manan, NB","Sainte-Madeleine, QC","Anmore, BC","Sainte-Croix, QC","Algonquin Highlands, ON","Valcourt, QC","Gimli, MB","Saint George, NB","Saint-Mathieu, QC","Paquetville, NB","Clearwater, BC","Addington Highlands, ON","Lillooet, BC","Burin, NL","Grand Bank, NL","Waterville, QC","Minto, NB","Rosthern No. 403, SK","Mansfield-et-Pontefract, QC","Saint-Denis, QC","Gore, QC","Outlook, SK","Saint-Gédéon-de-Beauce, QC","Saint-Léonard-d'Aston, QC","Fort-Coulonge, QC","Albanel, QC","St. Anthony, NL","Pessamit, QC","Logan Lake, BC","Maskinongé, QC","Saint-Charles-de-Bellechasse, QC","Fogo Island, NL","Neebing, ON","Port McNeill, BC","Hatley, QC","East Broughton, QC","Saint-Polycarpe, QC","Deschambault, QC","Canora, SK","Upper Miramichi, NB","Tofino, BC","Hardwicke, NB","Wendake, QC","Saint-Côme, QC","Waskaganish, QC","Twillingate, NL","Saint-Quentin, NB","Lebel-sur-Quévillon, QC","Calmar, AB","Nanton, AB","Pierreville, QC","New-Wes-Valley, NL","Pennfield Ridge, NB","Northesk, NB","West Interlake, MB","Biggar, SK","Kent, NB","Maple Creek, SK","Wabana, NL","Bonfield, ON","Saint-Gilles, QC","Saint-Bernard, QC","Sainte-Cécile-de-Milton, QC","Saint-Roch-de-Richelieu, QC","Burns Lake, BC","Redwater, AB","Saint-Nazaire, QC","Westfield Beach, NB","Saltair, BC","Saint-Elzéar, QC","Hinchinbrooke, QC","Dundurn No. 314, SK","Saint-François-Xavier-de-Brompton, QC","Papineauville, QC","Prairie View, MB","Saint-Ignace-de-Loyola, QC","Central Manitoulin, ON","Glovertown, NL","Tofield, AB","Madoc, ON","Sainte-Anne-de-Sabrevois, QC","Sainte-Anne-de-la-Pérade, QC","Saint-Damien-de-Buckland, QC","Baker Lake, NU","Saint-Ferdinand, QC","Pouch Cove, NL","Britannia No. 502, SK","Saint-Fulgence, QC","Digby, NS","Manouane, QC","Saint-Gervais, QC","Saint-Alexandre-de-Kamouraska, QC","Saint-Marc-sur-Richelieu, QC","Mandeville, QC","Salisbury, NB", "Témiscaming, QC","Magrath, AB","Sainte-Geneviève-de-Berthier, QC","Logy Bay-Middle Cove-Outer Cove, NL","Buctouche, NB","Grand Manan, NB","Sainte-Madeleine, QC","Anmore, BC","Sainte-Croix, QC","Algonquin Highlands, ON","Valcourt, QC","Gimli, MB","Saint George, NB","Saint-Mathieu, QC","Paquetville, NB","Clearwater, BC","Addington Highlands, ON","Lillooet, BC","Burin, NL","Grand Bank, NL","Waterville, QC","Minto, NB","Rosthern No. 403, SK","Mansfield-et-Pontefract, QC","Saint-Denis, QC","Gore, QC","Outlook, SK","Saint-Gédéon-de-Beauce, QC","Saint-Léonard-d'Aston, QC","Fort-Coulonge, QC","Albanel, QC","St. Anthony, NL","Pessamit, QC","Logan Lake, BC","Maskinongé, QC","Saint-Charles-de-Bellechasse, QC","Fogo Island, NL","Neebing, ON","Port McNeill, BC","Hatley, QC","East Broughton, QC","Saint-Polycarpe, QC","Deschambault, QC","Canora, SK","Upper Miramichi, NB","Tofino, BC","Hardwicke, NB","Wendake, QC","Saint-Côme, QC","Waskaganish, QC","Twillingate, NL","Saint-Quentin, NB","Lebel-sur-Quévillon, QC","Calmar, AB","Nanton, AB","Pierreville, QC","New-Wes-Valley, NL","Pennfield Ridge, NB","Northesk, NB","West Interlake, MB","Biggar, SK","Kent, NB","Maple Creek, SK","Wabana, NL","Bonfield, ON","Saint-Gilles, QC","Saint-Bernard, QC","Sainte-Cécile-de-Milton, QC","Saint-Roch-de-Richelieu, QC","Burns Lake, BC","Redwater, AB","Saint-Nazaire, QC","Westfield Beach, NB","Saltair, BC","Saint-Elzéar, QC","Hinchinbrooke, QC","Dundurn No. 314, SK","Saint-François-Xavier-de-Brompton, QC","Papineauville, QC","Prairie View, MB","Saint-Ignace-de-Loyola, QC","Central Manitoulin, ON","Glovertown, NL","Tofield, AB","Madoc, ON","Sainte-Anne-de-Sabrevois, QC","Sainte-Anne-de-la-Pérade, QC","Saint-Damien-de-Buckland, QC","Baker Lake, NU","Saint-Ferdinand, QC","Pouch Cove, NL","Britannia No. 502, SK","Saint-Fulgence, QC","Digby, NS","Manouane, QC","Saint-Gervais, QC","Saint-Alexandre-de-Kamouraska, QC","Saint-Marc-sur-Richelieu, QC","Mandeville, QC","Salisbury, NB", "Témiscaming, QC","Magrath, AB","Sainte-Geneviève-de-Berthier, QC","Logy Bay-Middle Cove-Outer Cove, NL","Buctouche, NB","Grand Manan, NB","Sainte-Madeleine, QC","Anmore, BC","Sainte-Croix, QC","Algonquin Highlands, ON","Valcourt, QC","Gimli, MB","Saint George, NB","Saint-Mathieu, QC","Paquetville, NB","Clearwater, BC","Addington Highlands, ON","Lillooet, BC","Burin, NL","Grand Bank, NL","Waterville, QC","Minto, NB","Rosthern No. 403, SK","Mansfield-et-Pontefract, QC","Saint-Denis, QC","Gore, QC","Outlook, SK","Saint-Gédéon-de-Beauce, QC","Saint-Léonard-d'Aston, QC","Fort-Coulonge, QC","Albanel, QC","St. Anthony, NL","Pessamit, QC","Logan Lake, BC","Maskinongé, QC","Saint-Charles-de-Bellechasse, QC","Fogo Island, NL","Neebing, ON","Port McNeill, BC","Hatley, QC","East Broughton, QC","Saint-Polycarpe, QC","Deschambault, QC","Canora, SK","Upper Miramichi, NB","Tofino, BC","Hardwicke, NB","Wendake, QC","Saint-Côme, QC","Waskaganish, QC","Twillingate, NL","Saint-Quentin, NB","Lebel-sur-Quévillon, QC","Calmar, AB","Nanton, AB","Pierreville, QC","New-Wes-Valley, NL","Pennfield Ridge, NB","Northesk, NB","West Interlake, MB","Biggar, SK","Kent, NB","Maple Creek, SK","Wabana, NL","Bonfield, ON","Saint-Gilles, QC","Saint-Bernard, QC","Sainte-Cécile-de-Milton, QC","Saint-Roch-de-Richelieu, QC","Burns Lake, BC","Redwater, AB","Saint-Nazaire, QC","Westfield Beach, NB","Saltair, BC","Saint-Elzéar, QC","Hinchinbrooke, QC","Dundurn No. 314, SK","Saint-François-Xavier-de-Brompton, QC","Papineauville, QC","Prairie View, MB","Saint-Ignace-de-Loyola, QC","Central Manitoulin, ON","Glovertown, NL","Tofield, AB","Madoc, ON","Sainte-Anne-de-Sabrevois, QC","Sainte-Anne-de-la-Pérade, QC","Saint-Damien-de-Buckland, QC","Baker Lake, NU","Saint-Ferdinand, QC","Pouch Cove, NL","Britannia No. 502, SK","Saint-Fulgence, QC","Digby, NS","Manouane, QC","Saint-Gervais, QC","Saint-Alexandre-de-Kamouraska, QC","Saint-Marc-sur-Richelieu, QC","Mandeville, QC","Salisbury, NB","Témiscaming, QC", "Magrath, AB","Sainte-Geneviève-de-Berthier, QC","Logy Bay-Middle Cove-Outer Cove, NL","Buctouche, NB","Grand Manan, NB","Sainte-Madeleine, QC","Anmore, BC","Sainte-Croix, QC","Algonquin Highlands, ON","Valcourt, QC","Gimli, MB","Saint George, NB","Saint-Mathieu, QC","Paquetville, NB","Clearwater, BC","Addington Highlands, ON","Lillooet, BC","Burin, NL","Grand Bank, NL","Waterville, QC","Minto, NB","Rosthern No. 403, SK","Mansfield-et-Pontefract, QC","Saint-Denis, QC","Gore, QC","Outlook, SK","Saint-Gédéon-de-Beauce, QC","Saint-Léonard-d'Aston, QC","Fort-Coulonge, QC","Albanel, QC","St. Anthony, NL","Pessamit, QC","Logan Lake, BC","Maskinongé, QC","Saint-Charles-de-Bellechasse, QC","Fogo Island, NL","Neebing, ON","Port McNeill, BC","Hatley, QC","East Broughton, QC","Saint-Polycarpe, QC","Deschambault, QC","Canora, SK","Upper Miramichi, NB","Tofino, BC","Hardwicke, NB","Wendake, QC","Saint-Côme, QC","Waskaganish, QC","Twillingate, NL","Saint-Quentin, NB","Lebel-sur-Quévillon, QC","Calmar, AB","Nanton, AB","Pierreville, QC","New-Wes-Valley, NL","Pennfield Ridge, NB","Northesk, NB","West Interlake, MB","Biggar, SK","Kent, NB","Maple Creek, SK","Wabana, NL","Bonfield, ON","Saint-Gilles, QC","Saint-Bernard, QC","Sainte-Cécile-de-Milton, QC","Saint-Roch-de-Richelieu, QC","Burns Lake, BC","Redwater, AB","Saint-Nazaire, QC","Westfield Beach, NB","Saltair, BC","Saint-Elzéar, QC","Hinchinbrooke, QC","Dundurn No. 314, SK","Saint-François-Xavier-de-Brompton, QC","Papineauville, QC","Prairie View, MB","Saint-Ignace-de-Loyola, QC","Central Manitoulin, ON","Glovertown, NL","Tofield, AB","Madoc, ON","Sainte-Anne-de-Sabrevois, QC","Sainte-Anne-de-la-Pérade, QC","Saint-Damien-de-Buckland, QC","Baker Lake, NU","Saint-Ferdinand, QC","Pouch Cove, NL","Britannia No. 502, SK","Saint-Fulgence, QC","Digby, NS","Manouane, QC","Saint-Gervais, QC","Saint-Alexandre-de-Kamouraska, QC","Saint-Marc-sur-Richelieu, QC","Mandeville, QC", "Caplan, QC","Allardville, NB","Saint-Damien, QC","Lac-Nominingue, QC","Obedjiwan, QC","Rama, SK","Deloraine-Winchester, MB","Oakland-Wawanesa, MB","Brenda-Waskada, MB","Russell-Binscarth, MB","Ellice-Archie, MB","Souris-Glenwood, MB","Riverdale, MB","Pembina, MB","Wallace-Woodworth, MB","Lorne, MB","Yellowhead, MB","Swan Valley West, MB","Grey, MB","Gilbert Plains, MB","Norfolk-Treherne, MB","Emerson-Franklin, MB","Sifton, MB","Grassland, MB","Louise, MB","Ste. Rose, MB","Cartwright-Roblin, MB","Mossey River, MB","Lakeshore, MB","Riding Mountain West, MB","Clanwilliam-Erickson, MB","Glenboro-South Cypress, MB","North Norfolk, MB","Reinland, MB","Minitonas-Bowsman, MB","Kippens, NL","Saint-Gédéon, QC","Lumby, BC","Kingsey Falls, QC","Provost, AB","Saint-Charles, NB","Swift Current No. 137, SK","Mattawa, ON","Blucher, SK","L'Ascension-de-Notre-Seigneur, QC","Bow Island, AB","Barraute, QC","One Hundred Mile House, BC","Saint-Liguori, QC","Saint Mary, NB","Saint-Patrice-de-Sherrington, QC","Fox Creek, AB","Lumsden No. 189, SK","Dawn-Euphemia, ON","Chapleau, ON","Saint-Esprit, QC","Montague, PE","Mashteuiatsh, QC","Saint-François-du-Lac, QC","Petit Rocher, NB","Eel River Crossing, NB","Millet, AB","Ucluelet, BC","Vallée-Jonction, QC","Manitouwadge, ON","Wellington, ON","Frontenac Islands, ON","Point Edward, ON","Picture Butte, AB","Manners Sutton, NB","Fort Qu’Appelle, SK","Vulcan, AB","Chetwynd, BC","Indian Head, SK","Wabush, NL","Saint-Fabien, QC","Harrison Hot Springs, BC","Watrous, SK","North Frontenac, ON","Lac-Supérieur, QC","Les Escoumins, QC","Richibucto, NB","Terrasse-Vaudreuil, QC","Rivière-Beaudette, QC","Orkney No. 244, SK","Saint-Barthélemy, QC","Komoka, ON","Nisga'a, BC","Austin, QC","Saint-Paul-de-l'Île-aux-Noix, QC","Behchokò, NT","Saint-Cyprien-de-Napierville, QC","Valleyview, AB","Déléage, QC","Potton, QC","Sainte-Béatrix, QC","Saint-Georges-de-Q14Cacouna, QC","Lakeview, BC","Sainte-Justine, QC","Saint-Valérien-de-Milton, QC", "Saint-Cuthbert, QC","Saint-Blaise-sur-Richelieu, QC","Middleton, NS","Kamsack, SK","Carberry, MB","Saint-Joseph-de-Coleraine, QC","Trinity Bay North, NL","Pointe-Lebel, QC","Grenville, QC","Saint-Michel-de-Bellechasse, QC","Sainte-Angèle-de-Monnoir, QC","Champlain, QC","Sacré-Coeur-Saguenay, QC","Saint-Louis, NB","Saint-Lucien, QC","Victoria, NL","Lumsden, SK","Saint-Robert, QC","Armstrong, MB","Keremeos, BC","Regina Beach, SK","La Guadeloupe, QC","Sutton, QC","Saint Andrews, NB","Saint-Placide, QC","Grunthal, MB","Povungnituk, QC","Pointe-des-Cascades, QC","Deseronto, ON","Lamont, AB","Chambord, QC","Maugerville, NB","Dudswell, QC","Nipissing, ON","Shaunavon, SK","Wynyard, SK","Cambridge Bay, NU","Dalmeny, SK","Saint-Narcisse, QC","Waswanipi, QC","Inukjuak, QC","Balgonie, SK","Piney, MB","Warfield, BC","Saint-Zacharie, QC","Hemmingford, QC","Saint-Pierre-de-l'Île-d'Orléans, QC","Kensington, PE","Shelburne, NS","Saint-Clet, QC","Blumenort, MB","Brighton, NB","Saint-Antoine, NB","Northampton, NB","Flat Rock, NL","Saint-Ours, QC","Stephenville Crossing, NL","Sainte-Anne-de-la-Pocatière, QC","Popkum, BC","Notre-Dame-du-Bon-Conseil, QC","Fisher, MB","Sainte-Clotilde, QC","Lantz, NS","Wicklow, NB","Nouvelle, QC","Wasagamack, MB","Rosthern, SK","Yamaska, QC","Neguac, NB","Saint-Antoine-de-Tilly, QC","Igloolik, NU","Whitehead, MB","Saint-Élie-de-Caxton, QC","Balmoral, NB","Price, QC","Rosedale, MB","Saint-Jacques-le-Mineur, QC","Coombs, BC","Val-Joli, QC","Southesk, NB","Huron Shores, ON","Saint-Antoine-sur-Richelieu, QC","Saint-Pacôme, QC","Saint-Stanislas-de-Kostka, QC","Saint-Jacques, NB","Frontenac, QC","Stuartburn, MB","Sainte-Émélie-de-l'Énergie, QC","Saint-Charles-sur-Richelieu, QC","Nipigon, ON","Witless Bay, NL","Sainte-Hélène-de-Bagot, QC","Franklin Centre, QC","Harbour Breton, NL","Mille-Isles, QC","Naramata, BC","Lyster, QC","Oakview, MB","Harrison Park, MB","Pond Inlet, NU", "Sainte-Clotilde-de-Horton, QC","Burford, ON","Saint-Benoît-Labre, QC","Terrace Bay, ON","Maliotenam, QC","Chapais, QC","Saint-Honoré-de-Shenley, QC","Cleveland, QC","Messines, QC","Saint-Laurent-de-l'Île-d'Orléans, QC","Saint-Jean-de-Dieu, QC","Massey Drive, NL","Nakusp, BC","Florenceville, NB","Larouche, QC","Fort St. James, BC","Saint-François-de-la-Rivière-du-Sud, QC","Wabasca, AB","Hilliers, BC","Perth, NB","Eeyou Istchee Baie-James, QC","Shellbrook No. 493, SK","Shawville, QC","Lambton, QC","Saint-Flavien, QC","Boissevain, MB","Sainte-Marcelline-de-Kildare, QC","Rivière-Blanche, QC","Bay Bulls, NL","Saint-Félix-de-Kingsey, QC","Upper Island Cove, NL","Sainte-Élisabeth, QC","Ashcroft, BC","Clarkes Beach, NL","Falmouth, NS","Uashat, QC","Saint-Bernard-de-Lacolle, QC","Saint-Joseph, NB","Belledune, NB","Saint-Guillaume, QC","Venise-en-Québec, QC","Gambo, NL","Nauwigewauk, NB","Humbermouth, NL","Springbrook, AB","Saint-Paulin, QC","Glenelg, NB","Saint David, NB","Saint-Albert, QC","Matagami, QC","Grindrod, BC","Springfield, NB","Amherst, QC","Carlyle, SK","Notre-Dame-du-Laus, QC","Langham, SK","St. George, NB","Wembley, AB","Macdonald, Meredith and Aberdeen Additional, ON","Pinawa, MB","Windermere, BC","Saint-Tite-des-Caps, QC","Hudson Bay, SK","Brudenell, Lyndoch and Raglan, ON","Gold River, BC","Saint-Casimir, QC","Dunsmuir, BC","Frenchman Butte, SK","Gordon, NB","Saint-Malachie, QC","Southampton, NB","Salluit, QC","Pangnirtung, NU","Saint-Louis-de-Gonzague, QC","Moosonee, ON","Englehart, ON","Saint-Urbain, QC","Tring-Jonction, QC","Wilton No. 472, SK","Denmark, NB","Saint-Joachim, QC","Torch River No. 488, SK","Saint-Théodore-d'Acton, QC","L’ Îsle-Verte, QC","Palmarolle, QC","Bon Accord, AB","Sussex Corner, NB","Saint-Odilon-de-Cranbourne, QC","Pipestone, MB","La Doré, QC","Lac-au-Saumon, QC","Wotton, QC","Prairie Lakes, MB","Elk Point, AB","St. François Xavier, MB","Shellbrook, SK","Wemindji, QC","Cape Dorset, NU","Strong, ON","Nobleford, AB", "Lappe, ON","Pointe-aux-Outardes, QC","Rivière-Héva, QC","Scott, QC","Godmanchester, QC","Macklin, SK","Armour, ON","Saint-Simon, QC","Tingwick, QC","Saint-Aubert, QC","Saint-Mathieu-du-Parc, QC","Saint-Ubalde, QC","Creighton, SK","Faraday, ON","Berthier-sur-Mer, QC","Bayfield, ON","Frampton, QC","Barrière, BC","Chute-aux-Outardes, QC","Lions Bay, BC","New Carlisle, QC","Laird No. 404, SK","Saint-Majorique-de-Grantham, QC","Petitcodiac, NB","Canwood No. 494, SK","Wentworth-Nord, QC","Bas Caraquet, NB","Two Hills, AB","Sainte-Ursule, QC","Dawson, YT","Nantes, QC","Lac-aux-Sables, QC","Stewiacke, NS","Vaudreuil-sur-le-Lac, QC","Grahamdale, MB","Upham, NB","St.-Charles, ON","Cardwell, NB","Amulet, QC","L’Avenir, QC","Hillsborough, NB","Spiritwood No. 496, SK","Pointe-à-la-Croix, QC","Hérouxville, QC","Weldford, NB","Reynolds, MB","St. Laurent, MB","L'Isle-aux-Allumettes, QC","Emo, ON","Sainte-Brigide-d'Iberville, QC","Les Éboulements, QC","Smooth Rock Falls, ON","Bruederheim, AB","Oxbow, SK","Telkwa, BC","Landmark, MB","Norton, NB","Gjoa Haven, NU","Sainte-Barbe, QC","Mayerthorpe, AB","Ootischenia, BC","Saint-Louis-du-Ha! Ha!, QC","Taylor, BC","Powerview-Pine Falls, MB","Ragueneau, QC","Baie Verte, NL","Chisholm, ON","Saint-Édouard, QC","Charlo, NB","Sorrento, BC","Burgeo, NL","Wadena, SK","St-Pierre-Jolys, MB","Richmond, NB","Youbou, BC","Swan Hills, AB","Wilkie, SK","Saint-Léonard, NB","Rivière-Bleue, QC","Noyan, QC","Notre-Dame-du-Portage, QC","Ile-à-la-Crosse, SK","Saint-Hugues, QC","Sainte-Anne-du-Sault, QC","La Conception, QC","Vauxhall, AB","Lamèque, NB","Arborg, MB","Estevan No. 5, SK","Thessalon, ON","L'Isle-aux-Coudres, QC","Lanigan, SK","Elton, MB","Bowden, AB","South Qu'Appelle No. 157, SK","Conestogo, ON","Rosser, MB","Sainte-Lucie-des-Laurentides, QC","Saint-Alexis, QC","Roxton Falls, QC", "Montcalm, MB","Irishtown-Summerside, NL","Clarendon, QC","Mervin No. 499, SK","Saint-Ludger, QC","Coldwell, MB","Musquash, NB","Racine, QC","Osler, SK","Saint-Zénon, QC","Saint-Armand, QC","Saint-Édouard-de-Lotbinière, QC","Alonsa, MB","Saint-Arsène, QC","Listuguj, QC","St. Joseph, ON","Queensbury, NB","Saint-Hubert-de-Rivière-du-Loup, QC","Saint-Jude, QC","La Minerve, QC","Trécesson, QC","Legal, AB","Moonbeam, ON","Notre-Dame-des-Pins, QC","Saint-Alban, QC","Saint-Pierre-les-Becquets, QC","Beaver River, SK","Labrecque, QC","Claremont, ON","New Bandon, NB","Sainte-Hénédine, QC","L'Anse-Saint-Jean, QC","Moose Jaw No. 161, SK","Bassano, AB","Parrsboro, NS","St. George's, NL","Fort Simpson, NT","Akwesasne, QC","Ignace, ON","Teulon, MB","Peel, NB","Miltonvale Park, PE","St. Lawrence, NL","Oxford, NS","Minto-Odanah, MB","Saint-Valère, QC","St. Alban's, NL","Kaleden, BC","Saint James, NB","Saint-Norbert-d'Arthabaska, QC","Manning, AB","Glenella-Lansdowne, MB","Saint-Hilarion, QC","Saint-Modeste, QC","Saint-Siméon, QC","Saint-Barnabé, QC","Irricana, AB","Saint Martins, NB","Two Borders, MB","Bury, QC","Lac-Bouchette, QC","Saint-Lazare-de-Bellechasse, QC","Saint-Michel-du-Squatec, QC","Saint-Joachim-de-Shefford, QC","Grand-Remous, QC","Saint-Gabriel-de-Rimouski, QC","Armstrong, ON","Rogersville, NB","Langenburg, SK","Sainte-Marie-Salomé, QC","Saint-Cyprien, QC","Centreville, NS","Maidstone, SK","Très-Saint-Sacrement, QC","Hillsburgh, ON","McAdam, NB","Newcastle, NB","Saints-Anges, QC","Saint-Urbain-Premier, QC","Centreville-Wareham-Trinity, NL","Alberton, PE","Winnipeg Beach, MB","Sainte-Agathe-de-Lotbinière, QC","Salmo, BC","Kipling, SK","Sagamok, ON","Grande-Vallée, QC","Bertrand, NB","Mont-Carmel, QC","Victoria, MB","Saint-Eugène, QC","Notre-Dame-des-Neiges, QC","Saint-André, NB","Roland, MB","Saint-Léon-de-Standon, QC","Hensall, ON","Carnduff, SK","Greenwich, NB","Carling, ON","Eckville, AB", "Nain, NL","Foam Lake, SK","Sayabec, QC","Laird, ON","Sainte-Sabine, QC","Tara, ON","Saint-Maxime-du-Mont-Louis, QC","Blanc-Sablon, QC","Cobalt, ON","South River, ON","Hudson Bay No. 394, SK","Waldheim, SK","McKellar, ON","Buffalo Narrows, SK","Ayer’s Cliff, QC","Les Méchins, QC","Sainte-Marguerite, QC","Saint-Claude, QC","Air Ronge, SK","Chipman, NB","Weyburn No. 67, SK","Alberta Beach, AB","Sainte-Jeanne-d'Arc, QC","Sainte-Félicité, QC","Girardville, QC","Saint-Bruno-de-Guigues, QC","Grenfell, SK","South Algonquin, ON","Upton, QC","Saint-Narcisse-de-Beaurivage, QC","Plaisance, QC","Roxton-Sud, QC","St. Louis No. 431, SK","Noonan, NB","Duchess, AB","Saint-Frédéric, QC","Saint-Narcisse-de-Rimouski, QC","Atholville, NB","Viking, AB","Sioux Narrows-Nestor Falls, ON","Repulse Bay, NU","Saint-Patrice-de-Beaurivage, QC","Bentley, AB","Durham, NB","Sainte-Marthe, QC","Notre-Dame-du-Nord, QC","Beachburg, ON","Pinehouse, SK","Saint-Aimé-des-Lacs, QC","Wedgeport, NS","Lac-Drolet, QC","Preeceville, SK","Maple Creek No. 111, SK","Harbour Main-Chapel's Cove-Lakeview, NL","Coleraine, QC","Birch Hills, SK","Saint-Bonaventure, QC","Saint-Wenceslas, QC","Kerrobert, SK","Havelock, NB","Eston, SK","Sainte-Geneviève-de-Batiscan, QC","Saint-Justin, QC","Saint-Norbert, QC","Schreiber, ON","Trochu, AB","Botsford, NB","Riviere-Ouelle, QC","Stukely-Sud, QC","Saint-Georges-de-Clarenceville, QC","Plantagenet, ON","Sainte-Thérèse-de-Gaspé, QC","Sainte-Pétronille, QC","Desbiens, QC","Clyde River, NU","La Macaza, QC","Souris, PE","Kindersley No. 290, SK","Falher, AB","Saint-Vallier, QC","Melita, MB","Davidson, SK","Bristol, QC","Mahone Bay, NS","Saint-Sylvestre, QC","Taloyoak, NU","Onoway, AB","Saint-Stanislas, QC","Battle River No. 438, SK","Malpeque, PE","Longue-Rive, QC","Argyle, MB","Delisle, SK","Plaster Rock, NB","Wilmot, NB","Valemount, BC","Saint-Léonard-de-Portneuf, QC","Longlaketon No. 219, SK","Papineau-Cameron, ON","Assiginack, ON", "Brébeuf, QC","Hudson Hope, BC","Baie-du-Febvre, QC","Durham-Sud, QC","Melbourne, QC","Nipawin No. 487, SK","Duck Lake No. 463, SK","Oyen, AB","Gravelbourg, SK","Lajord No. 128, SK","Hébertville, QC","Lorrainville, QC","Prince, ON","Athens, ON","Saint-René-de-Matane, QC","Eastman, QC","Kugluktuk, NU","Kedgwick, NB","Wemotaci, QC","Cookshire, QC","Dorchester, NB","Fortune, NL","Hamiota, MB","Gillam, MB","Grand View, MB","Dildo, NL","Laurierville, QC","Ripon, QC","Henryville, QC","Gracefield, QC","Chatsworth, ON","McCreary, MB","Yamaska-Est, QC","Rossburn, MB","Rothesay, NB","Ethelbert, MB","Frelighsburg, QC","Magnetawan, ON"};
        String location = location_city.getValue();
//        System.out.println(location);
        Current_date_time.setText(current_day());
        getCoordinate(location);
        double[] values= latlon.SQL_connect(state, city);
        a = new API(values[0],values[1]);
        a.connection();
        String[ ] temperature_value = a.get_temperature();
        String[ ] speed_value = a.get_wind_speed();
        String[ ] humidity_value = a.get_humidity();
        String[ ] prec_type = a.get_prec_type();

        a1.setText(temperature_value[0]+" C");
        a2.setText(temperature_value[1]+" C");
        a3.setText(temperature_value[2]+" C");
        a4.setText(temperature_value[3]+" C");
        a5.setText(temperature_value[4]+" C");
        a6.setText(temperature_value[5]+" C");
        a7.setText(temperature_value[6]+" C");
        a8.setText(temperature_value[7]+" C");
        c1.setText(speed_value[0]);
        c2.setText(speed_value[1]);
        c3.setText(speed_value[2]);
        c4.setText(speed_value[3]);
        c5.setText(speed_value[4]);
        c6.setText(speed_value[5]);
        c7.setText(speed_value[6]);
        c8.setText(speed_value[7]);
        humidity.setText("Humidity "+humidity_value[0]+" %");
    }
    private void getCoordinate(String Location){
        switch (Location)
        {
            case("Amsterdam, Netherlands"):{
                X=52.367;
                Y=4.904;
                break;
            }
            case("Ankara, Turkey"):{
                X=39.933;
                Y=32.859;
                break;
            }
            case("Ã…storp, Sweden"):{
                X=56.134;
                Y=12.945;
                break;
            }
            case("Athens, Greece"):{
                X=37.983;
                Y=23.727;
                break;
            }
            case("Belfast, Northern Ireland"):{
                X=54.597;
                Y=-5.93;
                break;
            }
            case("Barcelona, Spain"):{
                X=41.387;
                Y=2.168;
                break;
            }
            case("Berlin, Germany"):{
                X=52.52;
                Y=13.405;
                break;
            }
            case("Bern, Switzerland"):{
                X=46.948;
                Y=7.447;
                break;
            }
            case("Bilbao, Spain"):{
                X=43.263;
                Y=-2.935;
                break;
            }
            case("Brussels, Belgium"):{
                X=50.847;
                Y=4.357;
                break;
            }
            case("Bucharest, Romania"):{
                X=47.497;
                Y=19.04;
                break;
            }
            case("Budapest, Hungary"):{
                X=59.329;
                Y=18.068;
                break;
            }
            case("Cardiff, Wales"):{
                X=51.483;
                Y=-3.168;
                break;
            }
            case("Cologne, Germany"):{
                X=50.937;
                Y=6.96;
                break;
            }
            case("Copenhagen, Denmark"):{
                X=55.676;
                Y=12.568;
                break;
            }
            case("Cork, Ireland"):{
                X=51.898;
                Y=-8.475;
                break;
            }
            case("Dublin, Ireland"):{
                X=53.349;
                Y=-6.26;
                break;
            }
            case("Edinburgh, Scotland"):{
                X=55.953;
                Y=-3.188;
                break;
            }
            case("Florence, Italy"):{
                X=43.7696;
                Y=11.255;
                break;
            }
            case("Frankfurt, Germany"):{
                X=50.11;
                Y=8.682;
                break;
            }
            case("French Riviera, France"):{
                X=43.254;
                Y=6.637;
                break;
            }
            case("Funchal, Portugual"):{
                X=32.65;
                Y=-16.908;
                break;
            }
            case("Gibraltar"):{
                X=36.14;
                Y=-5.353;
                break;
            }
            case("Gothenburg, Sweden"):{
                X=57.708;
                Y=11.974;
                break;
            }
            case("Hamburg, Germany"):{
                X=53.548;
                Y=9.987;
                break;
            }
            case("Helsinki, Finland"):{
                X=60.169;
                Y=24.938;
                break;
            }
            case("Ibiza, Spain"):{
                X=39.02;
                Y=1.482;
                break;
            }
            case("Kyiv, Ukraine"):{
                X=50.45;
                Y=30.523;
                break;
            }
            case("Lillehammer, Norway"):{
                X=61.115;
                Y=10.466;
                break;
            }
            case("Lisbon, Portugual"):{
                X=38.722;
                Y=-9.139;
                break;
            }
            case("London, England"):{
                X=51.507;
                Y=-0.127;
                break;
            }
            case("Madrid, Spain"):{
                X=40.416;
                Y=-3.703;
                break;
            }
            case("Mallorca, Spain"):{
                X=39.695;
                Y=3.017;
                break;
            }
            case("Manchester, England"):{
                X=53.48;
                Y=-2.242;
                break;
            }
            case("Marseille, France"):{
                X=43.296;
                Y=5.369;
                break;
            }
            case("Maspalomas, Spain"):{
                X=27.76;
                Y=-15.586;
                break;
            }
            case("Milan, Italy"):{
                X=45.464;
                Y=9.19;
                break;
            }
            case("Munich, Germany"):{
                X=48.135;
                Y=11.582;
                break;
            }
            case("Naples, Italy"):{
                X=40.851;
                Y=14.268;
                break;
            }
            case("OÃ±ati, Spain"):{
                X=43.034;
                Y=-2.417;
                break;
            }
            case("Oslo, Norway"):{
                X=59.913;
                Y=10.752;
                break;
            }
            case("Paris, France"):{
                X=48.856;
                Y=2.352;
                break;
            }
            case("Prague, Czech Republic"):{
                X=50.075;
                Y=14.437;
                break;
            }
            case("ReykjavÃ­k, Iceland"):{
                X=64.146;
                Y=-21.942;
                break;
            }
            case("Riga, Latvia"):{
                X=56.879;
                Y=24.603;
                break;
            }
            case("Rome, Italy"):{
                X=41.902;
                Y=12.496;
                break;
            }
            case("Santa Cruz das Flores, Portugual"):{
                X=39.453;
                Y=-31.127;
                break;
            }
            case("Santa Cruz de Tenerife, Spain"):{
                X=28.463;
                Y=-16.251;
                break;
            }
            case("Skye, Scotland"):{
                X=57.273;
                Y=-6.215;
                break;
            }
            case("Sofia, Bulgaria"):{
                X=42.697;
                Y=23.321;
                break;
            }
            case("Stockholm, Sweden"):{
                X=59.329;
                Y=18.068;
                break;
            }
            case("Tallinn, Estonia"):{
                X=59.437;
                Y=24.753;
                break;
            }
            case("Vienna, Austria"):{
                X=18.208;
                Y=16.373;
                break;
            }
            case("Warsaw, Poland"):{
                X=52.229;
                Y=21.012;
                break;
            }
            case("York, England"):{
                X=53.961;
                Y=-1.07;
                break;
            }
            case("Zurich, Switzerland"):{
                X=47.376;
                Y=8.541;
                break;
            }
            default:{
                X= 0;
                Y = 0;
                System.out.println("ERROR in getcoordinate");
            }
        }
    }
    @Override
    public void initialize(URL arg, ResourceBundle arg1){
        location_city.getItems().addAll(ON);
        location_state.getItems().addAll(statelist);
    }
    public String current_day(){
        String[ ] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Calendar c = Calendar.getInstance();
        int week_day = c.get(Calendar.DAY_OF_WEEK);
        return day[week_day-1];
    }
}