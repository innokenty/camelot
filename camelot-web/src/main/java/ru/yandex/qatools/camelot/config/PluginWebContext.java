package ru.yandex.qatools.camelot.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.yandex.qatools.camelot.web.core.LocalClientBroadcastersProvider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ilya Sadykov (mailto: smecsia@yandex-team.ru)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginWebContext", propOrder = {
        "localBroadcastersProvider",
})
public class PluginWebContext extends PluginContext {
    @JsonIgnore
    protected transient LocalClientBroadcastersProvider localBroadcastersProvider;

    /**
     * Gets the value of the localBroadcastersProvider property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public LocalClientBroadcastersProvider getLocalBroadcastersProvider() {
        return localBroadcastersProvider;
    }

    /**
     * Sets the value of the localBroadcastersProvider property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLocalBroadcastersProvider(LocalClientBroadcastersProvider value) {
        this.localBroadcastersProvider = value;
    }
}
