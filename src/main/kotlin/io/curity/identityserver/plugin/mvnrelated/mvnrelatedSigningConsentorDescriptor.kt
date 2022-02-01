package io.curity.identityserver.plugin.mvnrelated

import se.curity.identityserver.sdk.plugin.descriptor.SigningConsentorPluginDescriptor

class mvnrelatedSigningConsentorDescriptor: SigningConsentorPluginDescriptor<mvnrelatedConsentorConfig>
{
    override fun getConsentorType() = mvnrelatedSigningConsentor::class.java

    override fun getPluginImplementationType() = "mvnrelated"

    override fun getConfigurationType() = mvnrelatedConsentorConfig::class.java
}
