#TODO   rapor tutar
#	backup alır ve github'a yükler 			
alias rapor='vim /home/xa/rapor/$(date +%d-%m-%y).md + '
alias raporw='$(printf "\n# %s \n\n\n" $(date +%H:%M:%S) >> /home/xa/rapor/$(date +%d-%m-%y).md) && vim /home/xa/rapor/$(date +%d-%m-%y).md +'
alias rapordel_='rm -rf /home/xa/rapor/$(date +%d-%m-%y).md'
alias raporls='ls /home/xa/rapor'
alias raporpwd='echo /home/xa/rapor'

raporc(){ vim /home/xa/rapor/"$@".md; }
rapordel__(){ rm /home/xa/rapor/"$@".md; }
raporhelp(){ printf "KOMUTLAR
	rapor 	   : 	Bu güne ait rapor dosyasını açar. 
	raporw 	   : 	Bu güne ait rapor dosyasını saat ekleyerek açar.
	rapordel_  : 	Bu güne ait rapor dosyasını siler.
	raporls	   : 	Raporları gösteriri.
	raporpwd   :    Raporların bulunduğu klasörü gösterir.
	raporc 	   : 	Özel bir isimle rapor başlatır & erişir.
	raporb     : 	Raporların tamamının backup'ını alır ve github a yükler.
	rapordel__ :    İsmi belirtilen raporu siler.\n\n";}

raporb(){
	mdir="$(pwd)";
	cd "/home/xa/rapor";
	git add *.md  && git commit -m "$(date +%H:%M:%S)" && git push;
	cd $mdir;
}
raporq(){ printf "\n# %s \n%s\n\n" $(date +%H:%M:%S) "$@" >> /home/xa/rapor/$(date +%d-%m-%y).md; }

