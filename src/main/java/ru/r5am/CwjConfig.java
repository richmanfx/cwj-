package ru.r5am;

import org.aeonbits.owner.Config;

/**
 * Чтение параметров из файла конфигурации
 */
@Config.Sources({"file:cwj.config"})
public interface CwjConfig extends Config {

    // Максимальные и минимальные размеры главного окна в пикселях
    Integer maximumWindowHeight();
    Integer maximumWindowWidth();
    Integer minimumWindowHeight();
    Integer minimumWindowWidth();

    // Стартовые размеры
    Integer startWindowHeight();
    Integer startWindowWidth();

    // Имя файла соответствия символов посылкам
    String symbolCwFileName();

    // Имя файла иконки
    String iconFileName();

    // Русские символы в выдаче
    boolean rusSymbols();

    // Английский интерфейс программы
    boolean engInterface();

    // Неслучайные слова в выдаче
    boolean notRandomWords();


}

