package io.curity.identityserver.plugin.mvnrelated

import se.curity.identityserver.sdk.oauth.consent.SigningConsentorResult
import se.curity.identityserver.sdk.oauth.consent.signing.SigningConsentor

class mvnrelatedSigningConsentor(private val _configuration: mvnrelatedConsentorConfig): SigningConsentor
{
    override fun start(textToDisplay: String, objectToSign: String): SigningConsentorResult
    {
        TODO()
    }

    override fun poll(): SigningConsentorResult
    {
        TODO()
    }

    override fun cancel()
    {
        TODO()
    }
}
