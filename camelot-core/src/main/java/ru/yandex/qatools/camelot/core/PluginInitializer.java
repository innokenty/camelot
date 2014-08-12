package ru.yandex.qatools.camelot.core;

import ru.yandex.qatools.camelot.config.Plugin;

/**
 * @author Ilya Sadykov (mailto: smecsia@yandex-team.ru)
 */
public interface PluginInitializer {

    void init(Plugin plugin) throws Exception;

}
